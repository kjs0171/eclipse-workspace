package chapter05.circle;

import chapter05.circle.Circle;		//import Ǯ���� �Է�
									//Ǯ���� : package + class = chapter05.circle.Circle
public class Circle_test {

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();			
		pizza.radios = 10;				
		pizza.name = "�ڹ� ����";			
		double area = pizza.getArea();	
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();	
		donut.radios = 2;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name +"�� ������ " + area);
		
	}

}
