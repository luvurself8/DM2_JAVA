package abstracttest;

public class PolygonTest {
	public static void main(String[] args) {
		MyCircle c = new MyCircle(5);
		c.setX(1);
		c.setY(2);
		
		System.out.println(c);
		
		MyRectangle r = new MyRectangle(2, 5);
		r.setX(4);
		r.setY(10);
		
		System.out.println(r);
		
	}
}
