package hiding;

public class Access {

	public static void main(String[] args) {
		
		Sample aClass = new Sample ();
		
		aClass.a = 10;
		//aClass.b = 10;
		aClass.setB(10);			// set���� ���� �ִ´�
		aClass.c = 10;
		
		System.out.println("a ������ �� : " + aClass.a);
		//System.out.println("b ������ �� : " + aClass.b);
		System.out.println("b ������ �� : " + aClass.getB());	// get���� ���� �޾ƿ´�
		System.out.println("c ������ �� : " + aClass.c);
		
	}
}