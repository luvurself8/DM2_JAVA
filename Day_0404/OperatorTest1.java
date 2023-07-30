
public class OperatorTest1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double)b); 
		System.out.println(a % b);
		// promotion -> casting
		System.out.println("덧셈의 결과: " + (a + b));
		System.out.println("덧셈의 결과: " + a + b);
		System.out.println("뺄셈의 결과: " + (a - b));
		System.out.println("곱셈의 결과: " + a * b);

	}

}
