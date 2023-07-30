
public class MethodTest6 {

	public static void main(String[] args) {
		double[] ary = myMethod();
		System.out.println(ary);
		
		String data = yourMethod();
		yourMethod(); // ''char(기본자료형), "" String(객체)
	}
	
	public static double[] myMethod() {
		double[] ary = {1.2,  3.4};
		
		return ary;
	}
	
	public static String yourMethod() {
		return "Hello world";
	}
	
	
	
	
	
	
	

}
