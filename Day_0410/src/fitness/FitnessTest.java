package fitness;

public class FitnessTest {
	public static void main(String[] args) {
		Fitness hong = new Fitness();
		
		hong.setId(123);
		hong.setName("홍길동");
		hong.setWeight(65.8);
		hong.setHeight(173.6);
		hong.output();
		System.out.println();
		
		Fitness son = new Fitness();
		
		son.setId(200);
		son.setName("손오공");
		son.setWeight(54.8);
		son.setHeight(170.9);
		
		son.output();
	}
}
