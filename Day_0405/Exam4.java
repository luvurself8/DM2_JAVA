/*
 * �� ������ ���� �Է� �޾� ��, ��, �� ������ ȯ���Ͽ� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int time, hour, minute, sec; 

		System.out.print("�ð��� �� ������ �Է��ϼ��� : ");
		time = keyin.nextInt();
		sec = time;
		hour = sec / 3600;
		sec = sec % 3600;
		minute = sec / 60;
		sec = sec % 60;

		System.out.println(time + "�ʴ� " + hour + "�ð� " + minute + "�� " + sec + "���Դϴ�.");
		
		keyin.close();

	}
}
