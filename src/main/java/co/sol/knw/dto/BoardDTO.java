package co.sol.knw.dto;

import java.util.Date;

import lombok.Data;

//board_idx number(4) PRIMARY key,--기본키 
//board_name varchar(50),--작성자 이름 
//board_title VARCHAR2(100),--제목
//board_content varchar(300),--내용
//board_date date default sysdate,--작성일
//board_hit number(4) default 0 --조회수

//@Data :lombok연결 어노테이션


@Data
public class BoardDTO {
	
	
	private int board_idx;
	private String board_name;
	private String board_title;
	private Date board_date;
	private int board_hit;
	private String board_content;
	
public BoardDTO() {
	
	
}
public BoardDTO(int board_idx, String board_name, String board_title, Date board_date, int board_hit ,String board_content) {
	super();
	this.board_idx = board_idx;
	this.board_name = board_name;
	this.board_title = board_title;
    this.board_content = board_content;
	this.board_date = board_date;
	this.board_hit = board_hit;
}


}

