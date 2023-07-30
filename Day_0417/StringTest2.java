
public class StringTest2 {

	public static void main(String[] args) {
		String str = "무궁화 꽃이 피었습니다. a";
		
		
		char ch = str.charAt(4);   // 인덱스 위치의 문자를 반환
		System.out.println(ch);
		
		int len = str.length();
		int temp = str.codePointAt(len-1);	// 인덱스 위치 문자의 코드를 반환
		System.out.println(temp);
		
//		compareTo(String anotherString)
		String str1 = "Koeka";
		String str2 = "Korea";
		
		System.out.println("compare값 : " + str1.compareTo(str2));
		// 두 문자열 비교해서 달라지는 첫 글자의 
		// 앞작: 음수, 앞크:양수, 같:0
		
//		String	concat(String str)
		str1 = "무궁화";
		str2 = "꽃";
		String result = str1.concat(str2);		
		
//		boolean	contains(CharSequence s) // String, StringBuffer
		System.out.println(result.contains("꽃"));
		
//		boolean	endsWith(String suffix)
		System.out.println(result.endsWith("꽃"));

//		boolean	startsWith(String prefix)
		System.out.println(result.startsWith("꽃"));
		
//		boolean	equals(Object anObject)
		System.out.println(result.equals("장미꽃"));
		
//		int	indexOf(int ch)
		System.out.println(result.indexOf('꽃'));
		// 전달인자로 코드에 해당하는 정수나
		// 특정 문자를 전달하면 그 문자의 위치를 반환
		
		String jumin = "911225-2012345";
		// 성별은? 인덱스 7의 데이터를 반환하시오.
		char gender = jumin.charAt(7);
		String tmp = gender == '1' ? "남자" : "여자";
		System.out.println(tmp);
		
//		boolean	isEmpty()
		System.out.println("".isEmpty());
		
//		int	lastIndexOf(int ch)
		str1 = "나리나리 개나리 입에 따다 물고요";
		System.out.println(str1.lastIndexOf('리'));	
		
//		int	length()
		System.out.println(str1.length());
		// length() :문자열의 길이를 구하는 메소드
		String[] ary = new String[10];
		
		System.out.println(ary.length); 
		// length : 배열의 길이를 구하는 속성
		
//		String	replace(char oldChar, char newChar)
		str1 = "송아지 송아지 얼룩 송아지";
		str1= str1.replace('송', '강');
		
//		String[]	split(String regex)
		str2 = "홍길동,100,95,87";
		String[] score = str2.split(",");
		System.out.println(score[1]);
		
		// 문자열로 된 데이터 "100" ==> 파싱(parse)
		int kor  = Integer.parseInt(score[1]); // Wrapper 클래스
		int math = Integer.parseInt(score[2]);
		int eng  = Integer.parseInt(score[3]);
		
		System.out.println("합계: " + (kor + math + eng));
		
		jumin = "911225-2012345";
		String year =  jumin.substring(0, 2);
		String month = jumin.substring(2, 4);
		String day   = jumin.substring(4, 6);
		
		System.out.println(year+"년 "+ month+"월 " + day+"일 생");
		year = "19".concat(year); 
		
		int now = 2023;
		int age = now - Integer.parseInt(year);
		System.out.println(age+"살 입니다.");
		
//		String	trim() 
		// 문자열의 맨앞, 맨뒤에 포함된 빈 문자열을 삭제
		jumin = "   911225-21234567    ";
		jumin = jumin.trim();
		System.out.println(jumin);
	}
}
