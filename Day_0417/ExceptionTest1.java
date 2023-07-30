
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			String[] str = {"1", "0", "1"};
			// uncatched exception ==> RuntimeException들
			int num1 = Integer.parseInt(str[0]); // 분자
			int num2 = Integer.parseInt(str[1]); // 분모
			int num3 = Integer.parseInt(str[2]); 
			int num4 = Integer.parseInt(str[3]); // 
			
			int result = num1 / num2;
			System.out.println("연산의 결과: " + result);
			// 실행할 코드가 겁나 많음...
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 익셉션이 발생하건 하지 않건 반드시 실행해야 하는 코드
		}

	}

}
