import java.util.Scanner;
// 표준체중 = (자신의키 - 100) x 0.9

public class Exam2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name, result;
		double height, weight, bmi, standard;
		
		System.out.print("이름 : ");
		name = keyin.next();
		
		System.out.print("키(cm) : ");
		height = keyin.nextDouble();
		
		System.out.print("몸무게(kg) : ");
		weight = keyin.nextDouble();
		
		standard = (height - 100) * 0.9;
		bmi = weight / ((height * 0.01) * (height * 0.01));
		
		if(bmi >= 35)        result = "고도비만";
		else if(bmi >= 30)   result = "중도비만";
		else if(bmi >= 25)   result = "경도비만";
		else if(bmi >= 23)   result = "과체중";
		else if(bmi >= 18.5) result = "정상";
		else                 result = "저체중";
		
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("키(cm) : " + height);
		System.out.println("몸무게(kg) : " + weight);
		System.out.printf ("표준체중 : %.2f%n", standard);
		System.out.printf ("BMI : %.2f%n", bmi);
		System.out.println("결과 : " + result);
		
		keyin.close();
	}
}
