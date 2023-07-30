import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String data;
		
		System.out.print("입력 : ");
		data = keyin.next();
		
		for(int i=0; i<data.length()/2; ++i) {
			if(data.charAt(i) != data.charAt(data.length()-i-1)) {
				System.out.println("'"+ data + "'는 회문이 아닙니다.");
				return;
			}
		}
		System.out.println("'"+ data + "'는 회문입니다.");
	}
}
