
public class ExceptionTest3 {

	public static void main(String[] args) throws Exception {
		int result = 0;
		try {
			result = divide(20, 10);
			System.out.println("나눈 데이터 답 : " + result);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		result = add(10, 20);
	}
	
	public static int divide(int a, int b) throws Exception {
		if(b <= 0) {
			throw new Exception ("음수를 처리하지 않음");
		}
		
		return a / b;
	}
	// 두 값을 더했을 때 20보다 크면 익셉션으로 처리
	public static int add(int a, int b) throws Exception {
		int result = a + b;
		
		if(result >= 20) 
			throw new Exception("합이 20보다 크면 안됨!");
		
		return result;
		
	}

}
