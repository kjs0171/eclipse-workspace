package chapter04;

import java.util.Scanner;

public class Loop_prc04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int num = scanner.nextInt();
		if (num % 3 ==0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		scanner.close();
	
	}

}
