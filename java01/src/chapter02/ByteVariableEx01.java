package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		byte num = -128;		// byte : 1byte (-2^7 ~ 2^7-1)
		byte num2 = 127;
		
		short num3 = -32768;    // short : 2byte ( 2^15 ~ 2^15-1)
		short num4 = 32767;     // -32768 ~ 32767
				
		int num5 = -2147483648; 
		int num6 = 2147483647;
		
		long num7 = 1234567890000L;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		
	}
	
	
	
}
