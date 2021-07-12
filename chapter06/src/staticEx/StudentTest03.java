package staticEx;

public class StudentTest03 {

	public static void main(String[] args) {

		Student01 studentLee = new Student01();
		studentLee.setStudentName("이지원");
		System.out.println(Student01.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student01 studentSon = new Student01();
		studentSon.setStudentName("손수경");
		System.out.println(Student01.serialNum);
		System.out.println(studentSon.studentName + "학번: " + studentSon.studentID);
		
	}

}
