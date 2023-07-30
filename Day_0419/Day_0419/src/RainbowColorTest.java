// values() : enum 의 모든 item을 배열로 반환하는 메소드

public class RainbowColorTest {

	public static void main(String[] args) {
		RainbowColor[] color = RainbowColor.values();
		System.out.println("Item 개수 : " + color.length);
		
		for(RainbowColor c : color)
			System.out.println(c);

		for(int i=0; i<color.length; ++i)
			System.out.println(color[i]);
		
		//-----------
		RainbowColor clr = RainbowColor.보라;
		
		switch(clr) {
		case 빨강 : System.out.println("빨강을 선택함");break;
		case 주황 : System.out.println("주황을 선택함");break;
		case 노랑 : System.out.println("노랑을 선택함");break;
		case 초록 : System.out.println("초록을 선택함");break;
		case 파랑 : System.out.println("파랑을 선택함");break;
		case 남색 : System.out.println("남색을 선택함");break;
		case 보라 : System.out.println("보라를 선택함");break;
		}

	}

}
