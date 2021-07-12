package staticEx;

public class StudentTest04 {

	public static void main(String[] args) {
		
		Student02 studentLee = new Student02();
		studentLee.setStudentName("이지원");
		System.out.println(Student02.getSerialNum());
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student02 studentSon = new Student02();
		studentSon.setStudentName("손수경");
		System.out.println(Student02.getSerialNum());
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
		
	}

}
