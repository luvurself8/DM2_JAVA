
public class FormatTest1 {

	public static void main(String[] args) {
		int idata = 15;
		double ddata = 3.14;
		char cdata = '&';
		String sdata = "무궁화 꽃이 피었습니다.";
		
		System.out.printf("정수값은 => %d\n", idata);
		System.out.printf("실수값은 => %.2f\n", ddata);
		System.out.printf("문자값은 => %c\n", cdata);
		System.out.printf("문자열은 => %s\n", sdata);
	}

}
