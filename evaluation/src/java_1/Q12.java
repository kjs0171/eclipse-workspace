package java_1;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[10];
		
		System.out.print("��� 10���� �Է��ϼ��� > ");
	
		
		for(int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
			if(array[i]%3 != 0)
				continue;
			System.out.print( array[i] + " ");
		}
		
		scanner.close();
	}

}
