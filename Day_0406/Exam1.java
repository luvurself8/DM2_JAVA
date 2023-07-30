import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		final int basicPay = 9260;
		int workingTime, payment, overTime, total;
		overTime = 0;

		System.out.print("근무 시간 입력: ");
		workingTime = keyin.nextInt();

		if(workingTime > 25) { 
			overTime = workingTime - 25;
			workingTime = 25;
		}
		overTime = (overTime < 0 ) ? 0 : overTime;
		
		total = (workingTime * basicPay) + (overTime * (basicPay+500));
		System.out.println("기본금액 : " + (workingTime * basicPay));
		System.out.println("추가금액 : " + (overTime * (basicPay+500)));
		System.out.println("총수령액 : " + total);
		
		keyin.close();
	}
}

