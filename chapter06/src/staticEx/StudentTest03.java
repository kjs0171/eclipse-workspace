package staticEx;

public class StudentTest03 {

	public static void main(String[] args) {

		Student01 studentLee = new Student01();
		studentLee.setStudentName("������");
		System.out.println(Student01.serialNum);
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student01 studentSon = new Student01();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student01.serialNum);
		System.out.println(studentSon.studentName + "�й�: " + studentSon.studentID);
		
	}

}
