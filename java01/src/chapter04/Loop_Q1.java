package chapter04;

import java.util.Scanner;

public class Loop_Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num1 = 30;
		int num2 = 6;		
		int result = 0;
		
		System.out.println(num1 + " �� " + num2 + " = ?");
		String S = scanner.next();
		char operator = S.charAt(0);		// String�� char�� ��ȯ
		
		switch (operator) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
			default :
				System.out.println("���� ����");
		}
		
		System.out.println(result);
		scanner.close();
	
		
		
	}

}
