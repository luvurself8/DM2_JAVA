import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
	    double radius;
	    final double pi = 3.14159;
	    
	    System.out.print("반지름 : ");
	    radius = scanner.nextDouble();
	    
	    double area = pi * (radius * radius);
	    
	    System.out.println("반지름 " + radius + "인 원의 면적은 " + area +"입니다.");
	    System.out.printf("반지름 %.2f인 원의 면적은 %.2f입니다.", radius, area);
	    
	    scanner.close();
	}
}
