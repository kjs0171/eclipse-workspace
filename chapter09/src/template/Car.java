package template;

public abstract class Car {
	
	public abstract void drive();		// �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���, ����� X
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	final public void run() {					// ���ø� �޼���
		startCar();								// 1. �õ��� �̴ϴ�.
		drive();	// ���� Ŭ�������� �������̵�		// 2. ������ �մϴ�.
		stop();		// ���� Ŭ�������� �������̵�		// 3. ���� ����ϴ�.
		turnOff();								// 4. �õ��� ���ϴ�.
	}
	
	
}
