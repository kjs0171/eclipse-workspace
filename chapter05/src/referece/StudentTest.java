package referece;

public class StudentTest {

	public static void main(String[] args) {
		
		Student04 studentLee = new Student04(1001, "Lee");
		
		studentLee.setKorean("����", 100);
		studentLee.setMath("����", 50);
		
		Student04 studentKim = new Student04(1002, "Kim");
		
		studentKim.setKorean("����", 70);
		studentKim.setMath("����", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		
	}

}
