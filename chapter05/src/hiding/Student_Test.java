package hiding;

public class Student_Test {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��";
			// ���۷��� ������ ���� �Ҵ�
		
		studentLee.studentID = 20210728;
		
		studentLee.setStudentName("�̻��");
			// Setter�� ��ּ� �Ҵ�.
		System.out.println(studentLee.getStudentName());
		
	}

}
