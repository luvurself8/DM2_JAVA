package board;

public class Board {
	private int boardseq;
	private String writer;
	private String title;
	private String regdate;
	private String contents;
	private int viewcount;
	private String attachment;
	
	public int getBoardseq() {
		return boardseq;
	}
	public void setBoardseq(int boardseq) {
		this.boardseq = boardseq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public void output() {
		System.out.println("번호: " + boardseq);
		System.out.println("작성자: " + writer);
		System.out.println("제목: " + title);
		System.out.println("작성일: " + regdate);
		System.out.println("글내용: " + contents);
		System.out.println("조회수: " + viewcount);
		System.out.println("첨부파일: " + attachment);
	}
}
