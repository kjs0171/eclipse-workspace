package chapter04;

public class If_ex05 {

	public static void main(String[] args) {

		int score = 70;
		char grade;
		
		if ( score >= 90 ) {
			grade = 'A';
		}
		else {
			grade ='B';
		}
		
		// ���ǹ��� �� �Ǵ� ���� �� �� ���׿������� ����
		
		System.out.println("����� ������ " + score + "�̰�, ������ " + grade + "�Դϴ�.");
	}

}
