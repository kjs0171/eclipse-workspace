package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personLee = new Person();
		personLee.name = "이순신";
		personLee.height = 175.5F;
		personLee.weight = 67.3F;
		
		Person personKim = new Person("김유신", 173.5F, 71.0F);
		
		
	}

}
