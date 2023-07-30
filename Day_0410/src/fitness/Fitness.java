package fitness;

// 설계도
public class Fitness {
	private int id;   // static은 this라고 하지 않는다.!
	private String name;
	private double height;
	private double weight;
	private double bmi;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
		calcBmi();
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
		calcBmi();
	}
	private void calcBmi() {
		bmi = weight / ((height*0.01) * (height*0.01));
	}
	
	// getter
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getHeight() {
		return this.height;
	}
	public double getBmi() {
		return this.bmi;
	}
	
	public void output() {
		System.out.println("회원 ID : " + id);
		System.out.println("회원이름 : " + name);
		System.out.println("몸무게(Kg): " + weight);
		System.out.println("키(cm) : " + height);
		System.out.println("BMI : " + bmi);
	}
}






