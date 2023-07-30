package polygon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);	
		Point[] p = new Point[100];
		int count = 0;
		String choice;
		double radius;
		int x, y, width, height;

		while(true) {
			System.out.print("1. 원  2. 사각형  3. 전체보기  4. 종료 : ");
			choice = keyin.next();

			switch(choice) {
			case "1" : 
				System.out.print("x : ");
				x = keyin.nextInt();
				System.out.print("y : ");
				y = keyin.nextInt();	
				System.out.print("radius : ");
				radius = keyin.nextDouble();
				
				p[count] = new Circle(x, y, radius);
				count++;
				break;
			case "2" : 
				System.out.print("x : ");
				x = keyin.nextInt();
				System.out.print("y : ");
				y = keyin.nextInt();	
				System.out.print("width : ");
				width = keyin.nextInt();
				System.out.print("height : ");
				height = keyin.nextInt();
				
				p[count] = new Rectangle(x, y, width, height);
				count++;
				
				break;
			case "3" : 
				print(p);
				break;
			case "4" : 
				return;
			}
		}
	}
	
	public static double calArea(Point point) {
		if(point instanceof Circle) {
			return ((Circle)point).area();
		}
		
		return ((Rectangle)point).area();
	}
	
	public static void print(Point[] point) {
		for(int i=0; i<point.length; ++i) {
			if(point[i] == null) return;
			
			if(point[i] instanceof Circle) {
				System.out.print((i+1) + ") 원 : ");
				System.out.print(point[i].getX() + ", " + point[i].getY());
				System.out.print(", "+ ((Circle)point[i]).getRadius() + ", ");
				System.out.println(calArea(point[i]));
			}
			
			if(point[i] instanceof Rectangle) {
				System.out.print((i+1) + ") 사각형 : ");
				System.out.print(point[i].getX() + ", " + point[i].getY() + ", ");
				System.out.print(((Rectangle)point[i]).getWidth() + ", ");
				System.out.print(((Rectangle)point[i]).getHeight() + ", ");
				System.out.println(calArea(point[i]));
			}
		}
	}
}
