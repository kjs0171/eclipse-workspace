package chapter05;

public class Rectangle {

	int wedith;
	int height;
	
	public double rectangleArea() {
		return wedith * height;
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.wedith = 4;
		rectangle.height = 5;
		
		double area = rectangle.rectangleArea();
		System.out.println(area);
		
		
		
	}
	
}
