package hiding;

public class Access {

	public static void main(String[] args) {
		
		Sample aClass = new Sample ();
		
		aClass.a = 10;
		//aClass.b = 10;
		aClass.setB(10);			// set으로 값을 넣는다
		aClass.c = 10;
		
		System.out.println("a 변수의 값 : " + aClass.a);
		//System.out.println("b 변수의 값 : " + aClass.b);
		System.out.println("b 변수의 값 : " + aClass.getB());	// get으로 값을 받아온다
		System.out.println("c 변수의 값 : " + aClass.c);
		
	}
}