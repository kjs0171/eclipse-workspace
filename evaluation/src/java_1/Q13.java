package java_1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int won = scanner.nextInt();
		int n;
	
		
		 for(int i = 0; i < unit.length; i++) {
			n = won / unit[i];
			won -= unit[i]*n;	
			System.out.println(unit[i] + "원짜리 : " + n + "개");
		 }
	}

}
