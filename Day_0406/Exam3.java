import java.util.Scanner;

/*
[문제-3] 정수 3개를 입력받는다. if문을 이용
(같은값은 입력하지 않음)

작은값에서부터 순서대로 출력하시오.
*/
public class Exam3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int max, min, median, temp;
		
		System.out.print("1번째 정수"); max = keyin.nextInt();
		System.out.print("2번째 정수"); min = keyin.nextInt();
		System.out.print("3번째 정수"); median = keyin.nextInt();
		
		if(max < min) {
			temp = max;
			max  = min;
			min  = temp;
		}
		
		if(max < median) {
			temp    = max;
			max     = median;
			median  = temp;
		}
		
		if(median < min) {
			temp    = min;
			min     = median;
			median  = temp;
		}
		
		System.out.println(max + " " + median + " " + min);
	}

}





