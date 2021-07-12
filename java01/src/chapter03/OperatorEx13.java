package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {

		int num = 0B00000101;
		
		System.out.println(num << 2);		// 연산 결과가 num에 적용 X
		System.out.println(num << 3);
		System.out.println(num << 4);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		System.out.println(num >> 1);
		
		System.out.println(num);
		
		num = num << 2;						// 할당 하면 num 변경
		System.out.println(num);
		System.out.println((num << 2));		// 변결된 num값으로 연산
		
	}

}
