package practice01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int n = sc.nextInt();
		
		int i = n / 10;
		int j = n % 10;
		
		if( i == j) 
			System.out.println("Yes! 10의 자리와 1읠 자리가 같습니다.");
		
		else { 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");	
		}
		
	}

}
