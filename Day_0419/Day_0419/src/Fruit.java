
public interface Fruit {
	public static final String BANANA = "바나나";
	public static final String APPLE  = "사과";
}

enum MyFavorite {
	BANANA("바나나"), APPLE("사과");
	
	private String korean;

	MyFavorite(String korean) {
		this.korean = korean;
	}
	public String getKorean() {
		return this.korean;
	}
}
