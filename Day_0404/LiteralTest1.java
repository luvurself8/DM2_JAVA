
public class LiteralTest1 {
	public static void main(String[] args) {
		byte by = 12;
		short sh = 45;
		int a = 42;     // 가장 많이 사용. 연산의 기본대상
		long ln = 45L;
		
		// byte result = by + 1;  // 연산의 결과가 int이다. 대입 불가
		
		
		int binary = 0b1111; 
		int octal = 0125;
		int hexa = 0xff0000;
		
		System.out.println(binary);   	// 10진수로 출력함
		System.out.println(octal);		// 10진수로 변환한 결과가 출력됨
		System.out.println(hexa);
		
		float f1 = 3.14F;
		double d1 = 3.14;
		double d2 = 1.5e5;
		double d3 = 1.5e-7;
		
		System.out.println(d2);
		System.out.println(d3);
		
		char ch ='a';
		System.out.println(ch);
		System.out.println(ch + 0);   
		// + 연산을 하면 정수로 변환되어 연산
		// char + int ==> int + int ==> 연산을 실시하고 결과를 보여줌
		// Promotion : 대입연산은 프로모션하지 않는다.
		//           : 연산을 위해 내부적으로 변경된것
		
		System.out.println((char)(ch + 1));
		// Casting : 개발자가 명시적으로 변경
		
		char ch1 ='A';
		System.out.println(ch1 + 0);  // 'A' --> 65
		
		System.out.println(ch > ch1); // true
		
		char ch2 ='가';
		System.out.println(ch2 + 0);
		
		boolean b1 = true;
		boolean b2 = 10 < 20;
		
		// 
		
	}
}






