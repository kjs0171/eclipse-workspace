package gameLevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {		// 템블릿 메서드 ( 작업의 순서를 정의 )
		run();								// 1. run()
		for(int i = 0; i < count; i++) {	// 2. jump() 입력 받은 count 횟수만큼 출력
			jump();
		}
		turn();								// 3. turn()
	}
	/*
	final public void gotest1() {
		System.out.println("메소드에 final이 할당 될 경우 오버라이딩 불가");
	}
	
	public void gotest2() {
		System.out.println("메소드에 final이 없을 경우 오버라이딩 가능");
	}
	*/
}
