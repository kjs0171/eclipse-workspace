package chapter05.circle;

import chapter05.circle.Circle;		//import 풀네임 입력
									//풀네임 : package + class = chapter05.circle.Circle
public class Circle_test {

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();			
		pizza.radios = 10;				
		pizza.name = "자바 피자";			
		double area = pizza.getArea();	
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();	
		donut.radios = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은 " + area);
		
	}

}
