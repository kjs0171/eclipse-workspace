package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personLee = new Person();
		personLee.name = "�̼���";
		personLee.height = 175.5F;
		personLee.weight = 67.3F;
		
		Person personKim = new Person("������", 173.5F, 71.0F);
		
		
	}

}
