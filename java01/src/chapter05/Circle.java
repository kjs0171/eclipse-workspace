package chapter05;

public class Circle {
	
	int radios;		//원의 반지름
	String name;	//원의 이름
	
	public Circle() {} 		//Circle 클래스의 기본 생성자(클래스 이름과 같은 이름을 갖는 메소드)
							//인풋 매개변수가 없고, 실행부도 없는 생성자 : 기본 생성자(생략 가능)
	
	public double getArea() {
		return 3.14 * radios * radios;
	}

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();			//Circle 객체 생성, 레퍼런스 이름 pizza
		pizza.radios = 10;				//피자의 반지름을 10으로 설정
		pizza.name = "자바 피자";			//피자ㅢ 이름을 설정
		double area = pizza.getArea();	//피자 면적 (getArea()를 호출해서 area 변수에 할당
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();	//Circle 객체 생성, 래퍼런스 이름 donut
		donut.radios = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은 " + area);
		
	}

}
