
public class MethodTest5 {

	public static void main(String[] args) {
		int[] arr = {10, 20};
		
		System.out.println("호출하기 전");
		System.out.println("arr[0]=" + arr[0] + ", arr[1]="+ arr[1]);		
		
		exchange(arr); // call by reference (원본 접근 가능)
		
		System.out.println("\n호출하고 난 후");
		System.out.println("arr[0]=" + arr[0] + ", arr[1]="+ arr[1]);		
	}
	
	public static void exchange(int[] b) {
		int temp;
		temp = b[0];
		b[0] = b[1];
		b[1] = temp;
	}

}
