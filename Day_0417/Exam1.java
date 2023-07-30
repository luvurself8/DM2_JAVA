/* 
 * [연습] 아래와 같이 문자열 배열이 있을 때 각 학생의 성적을 구하시오
 * (합계, 평균)
 */
public class Exam1 {
	public static void main(String[] args) {
		String[] score = {
				"홍길동 100 98.5 75.5",
				"임꺽정 85.5 70.4 70.5",
				"손오공 75.6 88.5 72",
				"저팔계 90 95.5 70.5",
				"사오정 87 88.5 90.5"
		};
		
		for(int i=0; i<score.length; ++i) {
			// 1) 한개씩 가져온다.
			
			// 2) 가져온 데이터를 split()를 이용해 분해한다.
			String[] temp = score[i].split(" ");
			
			// 3) 1, 2, 3번방 데이터는 파싱을 해서 합계를 구해 변수에 대입
			double kor = Double.parseDouble(temp[1]);
			double eng = Double.parseDouble(temp[2]);
			double mat = Double.parseDouble(temp[3]);
			
			double total = kor + eng + mat;
			// 4) 평균을 구해 변수에 대입
			double avg = total / 3;
			
			// 5) 출력
			System.out.printf("%s %6.2f %5.2f %5.2f %5.2f %5.2f%n",
					temp[0], kor, eng, mat, total, avg);
			
		}
		
	}

}
