package practice;

public abstract class Car {
	
	protected String name;
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();

	public void washCar() {
		System.out.println("������ �մϴ�.");
	}
	
	final public void run() {
	start();
	drive();
	stop();
	turnoff();
	washCar();
	
	}
}
