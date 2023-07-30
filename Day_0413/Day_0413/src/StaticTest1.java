class MyStatic {
	int data1;
	static int data2 = 22;  // 클래스 변수
	
	public MyStatic(int data1) {
		this.data1 = data1;
	}
	
	static void aMethod() {
		System.out.println("이것은 정적 메소드입니다." + data2);
		// System.out.println("이것은 정적 메소드입니다." + data1);
	}
}

class YourStatic {
	static int dataA = 10;
	static int dataB = 20;
	final static double DATA_C = 42.195;
	static void methodB() {
		System.out.println("a=" + dataA + ", b=" + dataB);
	}
	private YourStatic() {}
}

public class StaticTest1 {

	public static void main(String[] args) {
		YourStatic.methodB();
		// YourStatic ss = new YourStatic();
		
		
		System.out.println(MyStatic.data2);
	
		MyStatic.aMethod();
		
		
		MyStatic s = new MyStatic(15);
		System.out.println("결과: " + s.data1);

	}

}
