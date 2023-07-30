
public class MethodTest4 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("호출하기 전");
		System.out.println("a = " + a + ", b = " + b);
		
		exchange(a, b); // Call by value(값에 의한 호출)
		
		System.out.println("호출하고 난 후");
		System.out.println("a = " + a + ", b = " + b);
	}
	
	public static void exchange(int a, int b) {
		int temp;
		
		temp = a;
		a = b;
		b = temp;
	}

}
