package vo;

public enum RealEstateType {
	BuyingAndSelling("�Ÿ�"), Charter("����"), MonthlyRent("����");
	
	public String type;
	RealEstateType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
