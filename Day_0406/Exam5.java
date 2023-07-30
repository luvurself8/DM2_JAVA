import java.util.Scanner;
/*
 * [문제-5] 입력받은 수의 구구단 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int dan = 0;
		
		System.out.print("숫자 입력: ");
		dan = keyin.nextInt();
		
		for(int i=1; i<10; ++i)
			System.out.println(dan +" * " + i + " = " + (dan*i));
		
		keyin.close();
	}
}
