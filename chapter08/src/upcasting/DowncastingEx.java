package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("�����");		// ��ĳ����
		
		Student s = (Student) p;			// �ٿ�ĳ����, �ݵ�� �ڷ����� ����
		
		System.out.println(p.name);
		s.grade = "A";
		
		
	}

}