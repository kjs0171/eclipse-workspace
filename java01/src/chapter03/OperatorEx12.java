package chapter03;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		int num1 = 10;		// 00000000 00000000 00000000 00001010
							// 11111111 11111111 11111111 11110101
		
		int num2 = 5;		// 00000000 00000000 00000000 00000101
		
		int result1 = ~num1;
		int result2 = num1 & num2;
		int result3 = num1 | num2;
		int result4 = num1 ^ num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	
}
