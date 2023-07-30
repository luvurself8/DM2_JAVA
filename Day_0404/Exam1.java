/*
 * 문제 : 키와 몸무게를 이용하여 BMI 구하기
 */
public class Exam1 {
	public static void main(String[] args) {
		double height = 175.5;
		double weight = 69.7;
		String name = "홍길동";
		
		double bmi = weight / ((height*0.01)*(height*0.01));
		
		System.out.printf("%s님, 키는 %.1fcm, 몸무게 %.1fkg, BMI는 %.2f입니다.\n", name, height, weight, bmi);

	}

}
