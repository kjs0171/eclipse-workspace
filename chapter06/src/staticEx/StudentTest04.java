package staticEx;

public class StudentTest04 {

	public static void main(String[] args) {
		
		Student02 studentLee = new Student02();
		studentLee.setStudentName("������");
		System.out.println(Student02.getSerialNum());
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student02 studentSon = new Student02();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student02.getSerialNum());
		System.out.println(studentSon.studentName + " �й�:" + studentSon.studentID);
		
	}

}
