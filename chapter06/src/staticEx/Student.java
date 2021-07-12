package staticEx;

public class Student {

	
	public static int serialNum = 1000;		// 클래스 변수(모든 인스턴스에서 접근 가능)
											// ==> 프로그램이 로드 될 때 데이터 영역에 생성, 프로그램이 종료 될 때 제거
	int studentID;					// 멤버 변수(인스턴스 변수) > 힙 영역에 생성
	String studentName;				// ==> new 키워드를 통해서 인스턴스 생성 시에 힙 영역에서 생성, 가비지 컬렉터에 의해서 제거
	int grade;						// 해당 인스턴스 내에서만 사용
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
