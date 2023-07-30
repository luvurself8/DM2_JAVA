import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "케익, 꽃다발, 향수";
		
		// 공백이 기본 구분자
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
