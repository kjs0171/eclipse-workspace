package chapter05;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showSudentInfo() {
		System.out.println( studentName + ", " + address);	//�̸��� �ּ� ��� �ϴ� �޼ҵ�
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}

}
