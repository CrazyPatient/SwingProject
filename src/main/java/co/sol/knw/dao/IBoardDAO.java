package co.sol.knw.dao;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.sol.knw.dto.BoardDTO;


@Mapper 
public interface IBoardDAO {
	
	public List<BoardDTO> list(); 
	public int write(String board_name, String board_title, String board_content);
	public BoardDTO viewDTO(String board_idx);
	public int updateDTO(String board_idx, String board_name,String board_title, String board_content);
	public int deleteDTO(String board_idx);
    public int hit(String board_idx);

}
