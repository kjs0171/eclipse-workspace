package practice01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int n = sc.nextInt();
		
		int i = n / 10;
		int j = n % 10;
		
		if( i == j) 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		
		else { 
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");	
		}
		
	}

}
