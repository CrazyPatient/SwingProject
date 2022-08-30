package co.sol.knw.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyDTO {

	private int reply_idx;
	private String reply_name;
	private String reply_content;
	private Date reply_date;
	private int reply_board_idx;
	
	
	
	public ReplyDTO(int reply_idx, String reply_name, String reply_content, Date reply_date, int reply_board_idx) {
		super();
		this.reply_idx = reply_idx;
		this.reply_name = reply_name;
		this.reply_content = reply_content;
		this.reply_date = reply_date;
		this.reply_board_idx = reply_board_idx;
	}
	
}
