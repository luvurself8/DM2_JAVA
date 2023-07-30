package poly;

abstract class AA {
	abstract void methodAA();
}

class BB extends AA {
	@Override
	void methodAA() {
		System.out.println("BB클래스의 메소드입니다.");
	}
}

class CC extends AA {
	@Override
	void methodAA() {
		System.out.println("CC클래스의 메소드입니다.");
	}
}


public class PolyTest {
	public static void main(String[] args) {
		BB b = new BB();
		CC c = new CC();
		
		output(b);
		output(c);
	}

	private static void output(AA a) {
		a.methodAA(); // 동적 바인딩
	}
}










