package referece;

public class Student04 {
	
	int studentID;			// �⺻ �ڷ���
	String studentName;		// ���� �ڷ���(��ü�ڷ���), �ڹٿ��� �⺻ �����Ǵ�
	Subject korean;			// ���� �ڷ���(����� ���� �����ڷ���)
	Subject math;			// ���� �ڷ���
	
	
	public Student04(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	
	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("�л� " + studentName + "�� ������ " + total + "���Դϴ�.");
	}
	
	
	
}
