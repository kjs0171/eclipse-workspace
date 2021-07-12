package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
	
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);	// 1byte : byte
		System.out.println(iNum);	// 4byte : int
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
	}

}
