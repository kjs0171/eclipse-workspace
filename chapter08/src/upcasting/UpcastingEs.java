package upcasting;

public class UpcastingEs {

	public static void main(String[] args) {
		
		Person p ;
		Student s = new Student("�����");
		p = s;									// ��ĳ����, p = (person) s;
												//��ĳ���� �� ���� �ڷ����� �������� �ʾƵ� ���������� ����
		// Person p = new Student("�����");		// ��ĳ����
		
		System.out.println(p.name);
		
		//p.grade = "A";			// ������ ����
		//p.department = "HR";		// ������ ����
		//p.name = "ȫ�浿";
		//p.id = "ID";
		
		//s.grade = "A";
		//s.department = "HR";
		
		
	}

}