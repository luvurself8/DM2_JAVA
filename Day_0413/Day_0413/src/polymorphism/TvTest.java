package polymorphism;

public class TvTest {

	public static void main(String[] args) {
		CaptionTv c = new CaptionTv();
		FourKTv f   = new FourKTv();
		
		output(c);
		output(f);
	}
	
	// Tv타입 t는 모든 자식을 참조할 수 있다.
	public static void output(Tv t) { // 상위 레퍼런스변수가 하위 객체를 참조
		if(t instanceof CaptionTv) {
			((CaptionTv)t).channelUp(); // 쓰려는 시점에서는 다운캐스팅해야 한다!
		} else {
			((FourKTv)t).getResolution();
		}
	}
}
