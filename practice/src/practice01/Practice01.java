package practice01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요 >> ");
		int won = sc.nextInt();
		
		double d = (double) won / 1100;
		System.out.println(won + "원은 $" + d + "입니다.");
		
		
		
		
		
	}

}
