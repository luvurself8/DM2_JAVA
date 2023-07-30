/*
 * [문제-2] 
0 ~ 99까지 난수를 발생한다.
정수 배열 10개짜리 준비!

발생된 난수가 3의배수이거나 8의 배수인 경우에 배열에 저장하고
그렇지 않은 경우 익셉션 처리하여 모든 배열에 데이터를 넣으시오.
 */
public class Exam2 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for(int i=0; i<ary.length; ++i) {
			try {
				ary[i] = temp();
			} catch(Exception e) {
				--i;
				continue;
			}
		}
		
		// 출력
		for(int i=0; i<ary.length; ++i) {
			System.out.println(ary[i]);
		}
	}

	public static int temp() throws Exception {
		int a = (int)(Math.random()*100);
		
		if(!(a % 3 == 0 || a % 8 == 0))  
			throw new Exception("원하는 값이 아님");
			
		return a;  // 내가 원하는 값
	}
}









