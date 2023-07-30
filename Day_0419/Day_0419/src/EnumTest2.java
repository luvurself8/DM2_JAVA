
public class EnumTest2 {

	public static void main(String[] args) {
		Season s = Season.여름; // 생성자가 자동 호출됨
		
		// System.out.println(Season.여름.data);
		System.out.println(Season.가을.getData());
	}

}
