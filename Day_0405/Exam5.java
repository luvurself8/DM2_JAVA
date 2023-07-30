/*
지구의 공전 주기 : 365.2422일이다.
1년은 365일 xx시간 xx분 xx초로 구성되었는가?
*/
public class Exam5 {
	public static void main(String[] args) {
		double year = 365.2422;
		double second, temp;
		int date, hour, min;

		date = (int) year;           	// 365.2422중 365일을 date에 저장
		year = (year-date) * 24;  		// 0.2422에 24시간을 곱하여 h.hhh시간을 계산
		hour = (int)year;           	// h.hhh시간에서 정수부분을 취하여 hour에 저장
		year = (year-hour) * 60;  		// 0.hhh시간에 60분을 곱하여 mm.mmm분을 계산
		min = (int)year;           		// mm.mmm분에서 정수부분 분단위를 min에 저장
		second = (year-min) * 60;      	// 0.mmm분에 60초를 곱하여 초수를 계산

		System.out.printf("365.2422일은 %d일 %d시간 %d분 %.2f초 입니다.%n", date, hour, min, second);
	}
}
	