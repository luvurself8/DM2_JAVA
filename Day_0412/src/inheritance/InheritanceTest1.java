package inheritance;

class Parent {
	int age;
	public Parent() {
		System.out.println("Parent의 생성자입니다.");
	}
	public void output() {
		System.out.println("나이는 : " + this.age);
	}
}

class Child extends Parent {
	String name;
	public Child() {
		super();
		System.out.println("Child의 생성자입니다.");
	}
	public void print() {
		// 상위 클래스로부터 상속받은 메소드는 내꺼
		// super.output()도 가능 this.output()도 가능
		this.output(); 
		System.out.println("이름은 : " + this.name);
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.age = 50;
		p.output();
		
		Child c = new Child();
		c.age = 25;
		c.name = "홍길동";
		
		// c.output();
		c.print();

	}

}




