package inheritance4;



class A {
	public A() {
		System.out.println("������ A");
	}
}
class B extends A{
	public B() {
		// super();
		System.out.println("������ B");
	}
}	
class C extends B {
	public C() {
		super();		// super : ����Ŭ����(�θ�Ŭ����), �θ�Ŭ������ ������ ȣ��, �ݵ�� ù����	// �����Ǿ�����
		System.out.println("������ C");
	}
}


public class ConstructorEx02 {

	public static void main(String[] args) {
		
		C c;
		c = new C();
		
	}
}