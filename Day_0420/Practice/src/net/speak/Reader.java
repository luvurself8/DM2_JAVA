package net.speak;

public class Reader extends Man implements Speakable {
	
	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		String temp = super.getName()+"독자는 자바를 잘하고 싶다.";
		return temp;
	}
}
