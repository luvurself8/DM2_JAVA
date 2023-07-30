import java.util.Scanner;

public class WeatherTest {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String choice;
		System.out.print("1. 한글    2. 영문  => ");
		choice = keyin.next();

		Weather[] weather = Weather.values();

		switch(choice) {
		case "1" : 
			for(Weather w: weather) {
				System.out.println(w + " : " + w.playKor());
			}

			break;
		case "2" : 
			for(Weather w: weather) {
				System.out.println(w.getEnglish() + " : " + w.playEng());
			}

		}
	}
}
