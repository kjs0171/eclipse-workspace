package chapter04;

public class If_ex04_test {

	public static void main(String[] args) {

		int score = 64;
		char grade;
		
		if ( score >=90) {
			grade = 'A';
		}
		
		else if (score >=80) {
			grade = 'B';
		}
		
		else if (score >=70) {
			grade = 'C';
		}
		
		else if (score >=60) {
			grade = 'D';
		}
		
		else {
			grade = 'F';
		}
		
		System.out.println(grade);
		System.out.println("����� ������ "+score+"�� �Դϴ�. ������ "+grade+"�Դϴ�.");
	}
		// if�� �ٱ����� ���
}
