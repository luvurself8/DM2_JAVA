
public enum RainbowColor {
	빨강("Red"), 주황("Orange"), 노랑("Yellow"), 초록("Green"),
	파랑("Blue"), 남색("Dark Blue"), 보라("Pupple");
	
	private String color;
	private  RainbowColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
}
