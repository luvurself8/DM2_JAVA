package polygon;
// main만 못만들면 12점
public class Rectangle extends Point implements Area {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height ) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
