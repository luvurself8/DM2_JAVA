package inheritance;

class Parent2 {
	private int age;    // 접근지정자가 없으면 "package 지정자"라고 한다.

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void output() {
		System.out.println("나이는 : " + this.age);
	}
	@Override
	public String toString() {
		return "age = " + this.age;
	}
	
}

class Child2 extends Parent2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 오버라이드 (Override) : 상속받은 메소드의 기능을 확장할 때 
	// 사용하는 기능
	@Override
	public void output() {
		super.output();
		System.out.println("이름은 : " + this.name);
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.setAge(50);
		System.out.println(p.toString());
		System.out.println(p);

		Child2 c = new Child2();
		c.setAge(25);
		c.setName("홍길동");
		

		
		
		
		
		
		
		




	}

}




