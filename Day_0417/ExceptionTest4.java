
public class ExceptionTest4 {

	public static void main(String[] args) {
		int[] myAry = new int[10];

		for(int i=0; i<myAry.length; ++i) {
			try {
				int data = even();
				myAry[i] = data;
			} catch (Exception e) {
				--i;
				continue; 
			}
		} // end for
		
		// 출력
		for(int i=0; i<myAry.length; ++i) {
			System.out.println(myAry[i]);
		}
	}

	// 난수를 발생시킴 
	// 홀수 발생 시 익셉션
	// 짝수이면 반환
	public static int even() throws Exception {
		int value = (int)(Math.random()*100);

		if(value % 2 != 0)
			throw new Exception("홀수입니다.");

		return value;
	}


}
