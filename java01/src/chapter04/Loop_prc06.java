package chapter04;

import java.util.Scanner;

public class Loop_prc06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		if ( score >= 60) {
			if(year != 4) {
				System.out.println("�հ��Դϴ�.");
			}
			else if( score >= 70) {
				System.out.println("�հ��Դϴ�.");
			}
			else {
				System.out.println("���հ��Դϴ�.");
			}
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		
		scanner.close();
	}

}
