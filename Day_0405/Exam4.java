/*
 * 초 단위의 값을 입력 받아 시, 분, 초 단위로 환산하여 출력하는 프로그램
 */
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int time, hour, minute, sec; 

		System.out.print("시간을 초 단위로 입력하세요 : ");
		time = keyin.nextInt();
		sec = time;
		hour = sec / 3600;
		sec = sec % 3600;
		minute = sec / 60;
		sec = sec % 60;

		System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + sec + "초입니다.");
		
		keyin.close();

	}
}
