package chapter04;

public class Loop_while_ex {

	public static void main(String[] args) {

		int num = 1;			// num : 1~10
		int sum = 0;			// sum : ���� ���
		
		while (num <= 10) {
			sum = sum + num;		// sum = sum + num
			num = num + 1;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		
	}

}
