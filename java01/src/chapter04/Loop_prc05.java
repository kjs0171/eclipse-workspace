package chapter04;

import java.util.Scanner;

public class Loop_prc05 {

	public static void main(String[] args) {

		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		
		int score = scanner.nextInt();
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		
		scanner.close();
	}

}
