package staticEx;

public class StudentTest02 {

	public static void main(String[] args) {
		
		Student01 studentLee = new Student01();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		Student01 studentSon = new Student01();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);
		
	}

}
