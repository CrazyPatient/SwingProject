package co.sol.knw;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sol.knw.dao.IBoardDAO;
import co.sol.knw.dao.IReplyDAO;
import co.sol.knw.dto.BoardDTO;
import co.sol.knw.dto.ReplyDTO;

@Controller
public class TController {

	@Autowired
	IBoardDAO IBoardDAO;

	@Autowired
	IReplyDAO IReplyDAO;
	

	@RequestMapping("/")
	public String home() {
		return "redirect:ListForm";
	}

	@GetMapping("/ListForm")
	public String t1(Model m) {
		List<BoardDTO> list = IBoardDAO.list();
		m.addAttribute("list", list);

		return "ListForm";
	}

	@RequestMapping("/writeForm")
	public String write() {
		return "writeForm"; // url 연결
	}

	@RequestMapping("/writeAction")
	@ResponseBody
	public String writeAction(@RequestParam("board_name") String board_name,
			@RequestParam("board_title") String board_title, @RequestParam("board_content") String board_content,
			HttpServletRequest request) {
		
		int result = IBoardDAO.write(board_name, board_title, board_content);
		
		if (result == 1) {
			System.out.println("글 작성 성공띠");
			return "<script>alert('글쓰기 성공'); location.href='/ListForm'; </script>";

		} else {
			System.out.println("글 작성실패");
			return "writeForm";
		}
	}

	
	
	
	
	
	
	@RequestMapping("/writeReplyAction")
	@ResponseBody
	public String writeReplyAction(@RequestParam("reply_content") String reply_content,
							  @RequestParam("reply_name") String reply_name,
			                  @RequestParam("reply_board_idx") String reply_board_index,
			                  HttpServletRequest request) 
	{
		int result = IReplyDAO.reply_write(reply_name, reply_content, reply_board_index);
		
		if (result == 1) {
			System.out.println("댓글 작성 성공");
			return "<script>alert('댓글 작성 성공'); location.href='/contentForm?board_idx=" + reply_board_index + "'; </script>";

		} else {
			System.out.println("댓글 작성 실패");
			return "<script>alert('댓글 작성 실패'); location.href='/contentForm?board_idx=" + reply_board_index + "'; </script>";
		}
	}

	
	@RequestMapping("/contentForm")
	public String contentForm(@RequestParam("board_idx") String board_idx, Model model) {
		
		//조회수
		IBoardDAO.hit(board_idx);
		
		//게시글 보기
		BoardDTO dto = IBoardDAO.viewDTO(board_idx);
		System.out.println(dto);
		
		//댓글 리스트
		List<ReplyDTO> reply_list = IReplyDAO.reply_list(board_idx);
		model.addAttribute("reply_list", reply_list);
		
		model.addAttribute("dto", dto);
		return "contentForm";
	}
	
	
	
	
	
	@RequestMapping("/deleteAction")
	@ResponseBody
	public String deleteAction(@RequestParam("board_idx") String board_idx,
			HttpServletRequest sr) {

		int result = IBoardDAO.deleteDTO(board_idx);
		if (result == 1) {
			System.out.println("글 삭제 성공띠");
			return "<script>alert('삭제 성공'); location.href='/ListForm'; </script>";

		} else {
			System.out.println("글 삭제 실패 ㅠ");
			return "redirect:/contentForm";
		}
	}
	
	
	
	@RequestMapping("/updateAction")
	@ResponseBody
	public String updateAction(
			@RequestParam("board_idx") String board_idx,
			@RequestParam("board_name") String board_name,
			@RequestParam("board_title") String board_title, 
			@RequestParam("board_content") String board_content) {

		int result = IBoardDAO.updateDTO(board_idx, board_name, board_title, board_content);
		if (result == 1) {
			System.out.println("글 수정 성공띠");
			return "<script>alert('수정 성공'); location.href='/ListForm'; </script>";

		} else {
			System.out.println("글 수정 실패 ㅠ");
			return "redirect:/updateForm?board_idx" + board_idx;
		}
	}
	
	
	
	
	@RequestMapping("/deleteReplyAction")
	@ResponseBody
	public String deleteReplyAction(@RequestParam("reply_idx") String reply_idx,
									@RequestParam("board_idx") String board_idx,
			HttpServletRequest sr) {

		int result = IReplyDAO.reply_deleteDTO(reply_idx);
		if (result == 1) {
			System.out.println("댓글 삭제 성공");
			return "<script>alert('댓글 삭제 성공'); location.href='/contentForm?board_idx=" + board_idx + "'; </script>";

		} else {
			System.out.println("댓글 삭제 실패 ㅠ");
			return "<script>alert('댓글 삭제 실패'); location.href='/contentForm?board_idx=" + board_idx + "'; </script>";
		}
	}
	
	
	
	
	
}
