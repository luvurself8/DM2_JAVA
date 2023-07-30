import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 정수를 반복적으로 입력받아 누적하고자 한다. (5회)
 * 만약에 문자를 입력되어도 종료되지 않아야 한다.
 */
public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total = 0;  // 누적용
		int num;        // 입력용

		for(int i=0; i<5; ++i) {
			System.out.print("정수: ");
			try {
				num = keyin.nextInt();
			} catch(InputMismatchException e) {
				--i;
				keyin.nextLine();
				continue;
			}
			total += num;
			System.out.println("현재까지의 합 : " + total);
		}
	}

}






