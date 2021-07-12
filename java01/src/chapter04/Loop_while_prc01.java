package chapter04;

public class Loop_while_prc01 {

	public static void main(String[] args) {

		int num = 0;
		int n = 0;
		int sum = 0;
		
		while (n <= 10) {
			sum = sum + num;
			num = 2*n + 1;	
			n++;
		}
		System.out.println(sum);
	}

}
