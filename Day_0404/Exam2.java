/*
 * [ 문제-2 ]
학번, 이름, 프로그래밍(40%), 수학(30%), 영어(30%)를 저장할 변수 선언 및 초기화
합계를 구하여 출력하시오

<실행 예>
학번 : 230014
이름 : 손오공
프로그래밍 : 98
수학 : 87
영어 : 100
합계 : xx.xx점
 */
public class Exam2 {

	public static void main(String[] args) {
		String id = "230014";
		String name = "손오공";
		double prog = 98;
		double math = 87.0;
		double eng  = 100.0;
		double total = prog * 0.4 + math * 0.3 + eng * 0.3;
		
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
		System.out.println("프로그래밍: " + prog);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("합계: " + total+"점");

	}

}
