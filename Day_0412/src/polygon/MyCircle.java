package polygon;

public class MyCircle extends MyPoint {
	private double radius;

	public MyCircle() {
		super();
	}

	public MyCircle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", radius=" + radius+", area= " + area();
	}

}
