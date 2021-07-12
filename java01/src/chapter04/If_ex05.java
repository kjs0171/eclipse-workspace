package chapter04;

public class If_ex05 {

	public static void main(String[] args) {

		int score = 70;
		char grade;
		
		if ( score >= 90 ) {
			grade = 'A';
		}
		else {
			grade ='B';
		}
		
		// 조건문이 참 또는 거짓 일 때 삼항연산으로 가능
		
		System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
	}

}
