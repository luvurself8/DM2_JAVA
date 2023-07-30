
public enum Season {
	봄("Spring"), 여름("Summer"), 가을("Fall"), 겨울("Winter");
	
	private String data;
	
	Season(String data) {
		this.data = data;
		System.out.println("계절 " + this);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
