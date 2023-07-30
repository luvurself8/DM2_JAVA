import java.util.Objects;

import polymorphism.FourKTv;

class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person temp = null;
		if(obj instanceof Person) {
			 temp = (Person)(obj);
			 if(this.name.equals(temp.name) &&
					 this.age == temp.age ) return true;
			 else
				 return false;
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}



public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("홍길동", 25);


		System.out.println(p1 == p2);  // 주소
		System.out.println(p1.equals(p2));



	}

}





