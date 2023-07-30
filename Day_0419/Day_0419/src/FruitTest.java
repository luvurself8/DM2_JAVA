
public class FruitTest {

	public static void main(String[] args) {
		System.out.println(Fruit.BANANA); // 인터페이스
		System.out.println(Fruit.APPLE);
		String data = Fruit.APPLE;
		
		MyFavorite f = MyFavorite.APPLE;
		System.out.println(data.getClass());
		System.out.println(f.getClass());
		
		String kor = MyFavorite.APPLE.getKorean();
		

	}

}
