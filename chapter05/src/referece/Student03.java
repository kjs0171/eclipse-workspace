package referece;

public class Student03 {
	
	int studentID;			
	String studentNName;	
	Subject korean;			// 참조형 자료형(Subjeck 클래스) 국어 과목/점수
	Subject math;			
	
	public Student03() {
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
}
