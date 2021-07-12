package staticEx;

public class Student02 {

	private static int serialNum = 1000;	// 클래스 변수
		// 외부 클래스에서 접근 차단
		// setter에서 변수값 할당, getter에서 값을 가지고 온다.
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
	
	public static int getSerialNum() {		// 클래스 메소드, static 메소드
		int i = 10;		// 스텍 영역에 저장
						// 메소드가 실행이 끝나면 소멸
		// static 메소드에서는 멤버변수(인스턴스변수)를 사용할 수 없다.
		return serialNum;	// static 메소드에서는 클래스 변수 사용 가능
	}
	
	public static void setSerialNum(int serialNum) {
		Student02.serialNum = serialNum;
	}
}
