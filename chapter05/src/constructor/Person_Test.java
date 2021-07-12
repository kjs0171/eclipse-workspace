package constructor;

public class Person_Test {

	public static void main(String[] args) {

		//Person personLee = new Person();
		Person personKim = new Person();	// 기본 생성자 호출
		
		personKim.name = "김유신";
		personKim.height = 180F;
		personKim.weight = 85.5F;
		
		Person personLee = new Person ("이순신", 175, 75);

	}

}
