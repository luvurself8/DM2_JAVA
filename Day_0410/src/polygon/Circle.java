package polygon;

public class Circle {
	private int x;
	private int y;
	private double radius;
	private double area;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		calcArea();
	}
	public double getArea() {
		return area;
	}
	private void calcArea() {
		area = 3.14*radius*radius;
	}
	public void moveX(int x) {
		this.x = this.x + x;
	}
	public void output() {
		System.out.println("x좌표: " + x);
		System.out.println("y좌표: " + y);
		System.out.println("반지름: " + radius);
		System.out.println("면적: " + area);
	}
}
