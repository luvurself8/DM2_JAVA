package vo;

public class BuyingAndSelling extends RealEstate {
	private int price;

	public BuyingAndSelling() {
		super();
	}

	public BuyingAndSelling(int price) {
		super();
		this.price = price;
	}

	public BuyingAndSelling(String address, String houseType, int size, int price) {
		super(address, houseType, size);
		this.price = price;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + ", 매매가격: " + String.format("%,d", price);
	}
	
	
}
