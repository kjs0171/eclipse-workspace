package staticEx;

public class Student02 {

	private static int serialNum = 1000;	// Ŭ���� ����
		// �ܺ� Ŭ�������� ���� ����
		// setter���� ������ �Ҵ�, getter���� ���� ������ �´�.
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public Student02() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {		// Ŭ���� �޼ҵ�, static �޼ҵ�
		int i = 10;		// ���� ������ ����
						// �޼ҵ尡 ������ ������ �Ҹ�
		// static �޼ҵ忡���� �������(�ν��Ͻ�����)�� ����� �� ����.
		return serialNum;	// static �޼ҵ忡���� Ŭ���� ���� ��� ����
	}
	
	public static void setSerialNum(int serialNum) {
		Student02.serialNum = serialNum;
	}
}
