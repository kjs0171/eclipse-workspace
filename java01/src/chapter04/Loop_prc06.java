package chapter04;

import java.util.Scanner;

public class Loop_prc06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		System.out.print("학년을 입력하세요: ");
		int year = scanner.nextInt();
		
		if ( score >= 60) {
			if(year != 4) {
				System.out.println("합격입니다.");
			}
			else if( score >= 70) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
	}

}
