package gameLevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {		// �ۺ��� �޼��� ( �۾��� ������ ���� )
		run();								// 1. run()
		for(int i = 0; i < count; i++) {	// 2. jump() �Է� ���� count Ƚ����ŭ ���
			jump();
		}
		turn();								// 3. turn()
	}
	/*
	final public void gotest1() {
		System.out.println("�޼ҵ忡 final�� �Ҵ� �� ��� �������̵� �Ұ�");
	}
	
	public void gotest2() {
		System.out.println("�޼ҵ忡 final�� ���� ��� �������̵� ����");
	}
	*/
}