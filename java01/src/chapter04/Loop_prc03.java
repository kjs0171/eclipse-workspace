package chapter04;

import java.util.Scanner;

public class Loop_prc03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		
		int score = scanner.nextInt();
		if (score >= 80) {
		System.out.println("�հ��Դϴ�.");
		}
		else {
		System.out.println("���հ��Դϴ�.");	
		}
		
		scanner.close();
	}

}
