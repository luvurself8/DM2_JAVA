package board;

public class BoardTest {
	public static void main(String[] args) {
		Board b1 = new Board();
		
		b1.setBoardseq(1);
		b1.setWriter("홍길동");
		b1.setTitle("오늘은 월요일");
		b1.setContents("월요일은 일주일의 시작입니다.");
		b1.setRegdate("2023-04-10");
		
		b1.output();
		
	}
}
