package chapter04;

public class Loop_do_while_ex {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num ++;
		}while (num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println("SUM : " + sum);
		System.out.println("NUM : " + num);
	}

}
