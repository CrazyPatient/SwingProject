package co.sol.knw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.sol.knw.dto.BoardDTO;
import co.sol.knw.dto.ReplyDTO;

@Mapper
public interface IReplyDAO {

	public List<ReplyDTO> reply_list(String reply_board_index); 
	public int reply_write(String reply_name, String reply_content, String reply_board_index);
	public int reply_deleteDTO(String reply_idx);
	
}
