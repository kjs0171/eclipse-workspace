package upcasting;

public class UpcastingEs {

	public static void main(String[] args) {
		
		Person p ;
		Student s = new Student("김재상");
		p = s;									// 업캐스팅, p = (person) s;
												//업캐스팅 할 때는 자료형을 명시하지 않아도 묵시적으로 적용
		// Person p = new Student("김재상");		// 업캐스팅
		
		System.out.println(p.name);
		
		//p.grade = "A";			// 컴파일 오류
		//p.department = "HR";		// 컴파일 오류
		//p.name = "홍길동";
		//p.id = "ID";
		
		//s.grade = "A";
		//s.department = "HR";
		
		
	}

}
