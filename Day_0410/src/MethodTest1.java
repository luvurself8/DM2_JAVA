
public class MethodTest1 {

	public static void main(String[] args) {
		int result = 0;
		System.out.println("프로그램이 시작됨!");
		add1();
		
		add2();
		System.out.println("add2()의 결과: " + result);
		
		result = add3(12, 23); // 아규먼트(Argument), 전달인자
		System.out.println("add3()의 결과: " + result);

	}
	public static int add3(int num1, int num2) { // 파라미터(Parameter, 매개변수)
		int result = num1 + num2;
		
		return result;
	}
	
	public static void add1() {
		int num1 = 10;   // 지역변수
		int num2 = 20;
		
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		// return;  리턴할 내용이 없으면 return 자체를 생략할 수 있다.
	}
	
	public static int add2() {
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		
		return result;
	}
	


}













