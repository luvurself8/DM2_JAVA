import java.util.Scanner;
/*
 * [문제-6] 입력받은 수의 소수 판별
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int number;  // 8
		boolean flag = false;   // 소수가 아닐때 true, 소수일 때 false

		System.out.print("정수 입력: ");
		number = keyin.nextInt();
		
		for (int i=2; i < number; ++i) {
			if(number % i == 0) {
				flag = true;
				break; 
				// continue:반복문과 함께 사용. 
				// while내부 사용시 조건식쪽으로 이동
				// for 내부 증감식쪽으로 이동
			}
		}
		
		if(flag) System.out.println("소수가 아닙니다.");
		else     System.out.println("소수입니다.");

		keyin.close();
	}
}
