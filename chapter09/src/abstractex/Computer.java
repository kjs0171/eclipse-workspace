package abstractex;

public abstract class Computer {		// �߻� �޼ҵ� ����. ���ø�, �����ӿ�ũ ����, �������̽� ����.
	public abstract void display();		// �߻� �޼ҵ� : ����θ� �����ϰ�, ����ΰ� ���� �޼ҵ�
	public abstract void typing();		// �߻� �޼ҵ�
	
	//public void add(int a, int b) {}		// �Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}