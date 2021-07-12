package chapter05;

public class Figure {

	int width;
	int height;
	String name;
	
	public double triangleArea() {
		return width * height / 2;
	}
	public double squreArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Figure triangle;
		triangle = new Figure();
		triangle.width = 10;
		triangle.height = 10;
		triangle.name = "삼각형";
		double area1 = triangle.triangleArea();
		System.out.println(triangle.name + "의 면적은 " + area1);
		
		Figure squre;
		squre = new Figure();
		squre.width = 10;
		squre.height = 10;
		squre.name = "사각형";
		double area2 = squre.squreArea();
		System.out.println(squre.name + "의 면적은 " + area2);
		
	}

}
