package chapter02;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num  = 10;      // 일반적 10진법
		int bNum = 0B1010;  //0B : 2진법으로 값을 할당 (0b)
		int oNum = 012;     //0  : 8진법으로 값을 할당
		int hNum = 0XA;     //0X : 16진법으로 값을 할당 (0x)
	
		int test = -10;       //int > 정수값만
		
		
		
		System.out.println(num);     //ln > 라인을 띄워라
		System.out.print(bNum);      //ln 없으면 붙어서 다음 라인과 붙어서 출력
		System.out.println(oNum);
		System.out.println(hNum);
		System.out.println(test);
	
		
	}

}
