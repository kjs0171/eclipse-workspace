package constructor;

public class Person_Test {

	public static void main(String[] args) {

		//Person personLee = new Person();
		Person personKim = new Person();	// �⺻ ������ ȣ��
		
		personKim.name = "������";
		personKim.height = 180F;
		personKim.weight = 85.5F;
		
		Person personLee = new Person ("�̼���", 175, 75);

	}

}
