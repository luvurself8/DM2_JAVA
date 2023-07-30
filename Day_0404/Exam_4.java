import java.util.Scanner;

public class Exam_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
	    int value;
	    boolean result ; 
	    
	    System.out.print("자연수 : ");
	    value = scanner.nextInt();
	    result = value % 2 == 0;
	    
	    System.out.println("결과: " + result);
	    scanner.close();
	    
	    
	    int x = 10; 
	    int y = 20;
	    int temp;
	    
	    temp = x;
	    x = y;
	    y = temp;
	    
	    // 'A'(65) - 'a'(97) = ' ' 32
	    System.out.printf("변환된 결과 : %c%n", ('A' + 32));
	}
}






