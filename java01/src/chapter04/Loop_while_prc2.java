package chapter04;

public class Loop_while_prc2 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 1;
		int n = 0;
		
		while (n <= 10) {
			sum = sum + num;
			num = 2 * n;
			n++;			
		}
		System.out.println(sum);
	}

}
