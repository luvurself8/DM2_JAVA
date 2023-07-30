
public class MethodTest3 {

	public static void main(String[] args) {
		methodA();
		// methodB();  // 생성한 후에 사용가능
	}
	
	public static void methodA() {
		System.out.println("static 메소드입니다.");
		
	}
	
	public void methodB() {
		System.out.println("non static 메소드(methodB)입니다.");
		methodC();
		methodA();
	}
	
	public void methodC() {
		System.out.println("non static 메소드(methodC)입니다.");
	}

}
