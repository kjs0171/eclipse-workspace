package practice_00;

public class 논리연산자 {
	
	public static void main(String[] args) {
		
		int i = 20;
		int j = 30;
		
		boolean result;
		result = (5>3) && (2<3) ? true : false;
		System.out.println(result);
		
		boolean result2;
		result2 = (5>3) || (2>3) ? true : false;
		System.out.println(result2);
		
		boolean result3;
		result3 = !(5>3);
		System.out.println(result3);
		
		boolean result4;
		result4 = ((i + j) > 40) && ((j-i) > 20);
		System.out.println(result4);
		
		int num = i ^ j;
		System.out.println(num);
		
		i ^= j;
		System.out.println(i);
		
		int num10 =20;
		int num20 =30;
		num10 ^= num20;
		System.out.println(num10);
		
		
		int num3 = (10 < 5) ? 10: 20;
		System.out.println(num3);
	}

}
