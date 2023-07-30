import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// 키보드로부터 a, b의 값을 입력받아 사칙연산을 수행하시오.
		Scanner keyin = new Scanner(System.in);
		int a, b;
		
		System.out.println("정수 2개를 입력하시오 ");
		a = keyin.nextInt();
		b = keyin.nextInt();
		
		System.out.println("덧셈의 결과: " + add(a, b));
		System.out.println("뺄셈의 결과: " + substract(a, b));
		System.out.println("곱셈의 결과: " + multiply(a, b));
		System.out.println("나눗셈의 결과: " + divide(a, b));
		
		keyin.close();
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

}
