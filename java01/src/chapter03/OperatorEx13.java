package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {

		int num = 0B00000101;
		
		System.out.println(num << 2);		// ���� ����� num�� ���� X
		System.out.println(num << 3);
		System.out.println(num << 4);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		System.out.println(num >> 1);
		
		System.out.println(num);
		
		num = num << 2;						// �Ҵ� �ϸ� num ����
		System.out.println(num);
		System.out.println((num << 2));		// ����� num������ ����
		
	}

}
