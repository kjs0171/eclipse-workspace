package referece;

public class Student04 {
	
	int studentID;			// 기본 자료형
	String studentName;		// 참조 자료형(객체자료형), 자바에서 기본 제공되는
	Subject korean;			// 참조 자료형(사용자 정의 객제자료형)
	Subject math;			// 참조 자료형
	
	
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
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점입니다.");
	}
	
	
	
}
