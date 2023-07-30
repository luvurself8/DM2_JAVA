package abstracttest;

public class MyRectangle extends MyPoint {
	private double width;
	private double height;
	public MyRectangle() {
		super();
	}
	public MyRectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public String toString() {
		return super.toString() + ", width=" + width 
				+ ", height=" + height
				+ ", area = " + this.area();
	}
	
	
}
