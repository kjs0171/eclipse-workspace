package classpart;

public class FunctionTest03 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		int sum = gob (num1, num2);
		System.out.println(sum);
	}

	public static int gob(int n1, int n2) {
		int result = n1 * n2;
		return result;
		
	}

}