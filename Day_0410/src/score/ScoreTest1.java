package score;
// ClassTest1.java --(컴파일)--> ClassTest1.class --> 실행
//                               Score.class                               

public class ScoreTest1 {
	public static void main(String[] args) {
		// 클래스를 생성해서 사용
		Score s1 = new Score(); // 생성자 메소드 (Constructor)

		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(98);
		s1.setMat(88);
		s1.setAvg((s1.getKor() + s1.getEng() + s1.getMat()) / 3.0);
		System.out.println(s1.getName() + " : " + s1.getAvg());
		
	}
}
