package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "�ȿ���";
		student1.grade = 3;
		student1.studentID = 1000;
		
		Student student2 = new Student();
		student2.studentName = "���̽�";
		student2.grade = 3;
		student2.studentID = 1003;
		
		System.out.println(student1.studentName + "�� �г��� " +student1.grade + "�г��̰�, ��ȣ�� " + student1.studentID);
		System.out.println(student2.getStudentName() + "�� �г��� " +student2.getGrade() + "�г��̰�, ��ȣ�� " + student2.studentID);
		
		
	}

}
