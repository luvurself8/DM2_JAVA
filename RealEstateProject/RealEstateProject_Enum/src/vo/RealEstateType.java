package vo;

public enum RealEstateType {
	BuyingAndSelling("매매"), Charter("전세"), MonthlyRent("월세");
	
	public String type;
	RealEstateType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
