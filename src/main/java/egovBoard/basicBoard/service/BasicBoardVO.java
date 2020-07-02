package egovBoard.basicBoard.service;

public class BasicBoardVO {
	
	private int no;
	
	/** 제목 */
	private String title;
	
	/** 내용 */
	private String content;
	
	/** 등록자 */
	private String writer;
	
	/** 날짜 */
	private String date;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
