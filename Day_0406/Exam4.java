import java.util.Scanner;

/*
[문제-4] 달걀의 무게를 반복적으로 입력받는다.
5~7g 만 출하가 가능한 달걀이다. 
5개가 패킹이 완료되면 종료한다.
*/

public class Exam4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int egg, count=0;
		;
		
		while(true) {
			System.out.print("달걀 무게 입력: ");
			egg = keyin.nextInt();
			
			if(egg >= 5 && egg <= 7) {
				++count;
				System.out.println(count + "개 포장");
			}
			else System.out.println("포장 불가");
			if(count >= 5) break;
		}

		System.out.println("** 1팩 출하");
		
		keyin.close();
	}

}





