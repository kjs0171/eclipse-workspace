package chapter04;

public class Loop_for_continue {

	public static void main(String[] args) {

		int total = 0;
		int num ;
		
		//for (int total = 0, int num = 1 ; num <=100 ; num++){
		for (num = 1 ; num <= 100 ; num++ ) {
			
			if (num % 2 == 0)
				continue;
			
			total += num;	// total + total + num
		}
		System.out.println("1���� 100���� Ȧ���� ���� " + total + "�Դϴ�.");
	}

}
