
public class PersonTest {

	public static void main(String[] args) {
		Person[] person = Person.values();
		
		for(Person p : person) {
			System.out.println(p + " " + p.getNickName() + " " + p.work());
			System.out.println(p.name());
			System.out.println(p.ordinal());
		}
	}
}
