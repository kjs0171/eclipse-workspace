package staticEx;

public class Student {

	
	public static int serialNum = 1000;		// Ŭ���� ����(��� �ν��Ͻ����� ���� ����)
											// ==> ���α׷��� �ε� �� �� ������ ������ ����, ���α׷��� ���� �� �� ����
	int studentID;					// ��� ����(�ν��Ͻ� ����) > �� ������ ����
	String studentName;				// ==> new Ű���带 ���ؼ� �ν��Ͻ� ���� �ÿ� �� �������� ����, ������ �÷��Ϳ� ���ؼ� ����
	int grade;						// �ش� �ν��Ͻ� �������� ���
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	/*
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	*/
	
}
