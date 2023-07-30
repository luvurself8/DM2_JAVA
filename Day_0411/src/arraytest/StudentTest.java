package arraytest;

public class StudentTest {

	public static void main(String[] args) {
		int[] iary = new int[10];
		iary[0] = 15;
		
		String[] sary = new String[10];
		sary[0] = "대한민국";
		
		// 객체 배열
		// 
		int count = 0;
		Student[] stdary = new Student[10];
		stdary[count] = new Student("1", "홍길동", 24);
		++count; 
		
		stdary[count] = new Student("2", "홍길순", 24);
		count++;
		
		stdary[count] = new Student("2", "전우치", 24);

	}

}




