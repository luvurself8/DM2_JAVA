/*
������ ���� �ֱ� : 365.2422���̴�.
1���� 365�� xx�ð� xx�� xx�ʷ� �����Ǿ��°�?
*/
public class Exam5 {
	public static void main(String[] args) {
		double year = 365.2422;
		double second, temp;
		int date, hour, min;

		date = (int) year;           	// 365.2422�� 365���� date�� ����
		year = (year-date) * 24;  		// 0.2422�� 24�ð��� ���Ͽ� h.hhh�ð��� ���
		hour = (int)year;           	// h.hhh�ð����� �����κ��� ���Ͽ� hour�� ����
		year = (year-hour) * 60;  		// 0.hhh�ð��� 60���� ���Ͽ� mm.mmm���� ���
		min = (int)year;           		// mm.mmm�п��� �����κ� �д����� min�� ����
		second = (year-min) * 60;      	// 0.mmm�п� 60�ʸ� ���Ͽ� �ʼ��� ���

		System.out.printf("365.2422���� %d�� %d�ð� %d�� %.2f�� �Դϴ�.%n", date, hour, min, second);
	}
}
	