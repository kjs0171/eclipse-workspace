package chapter05;

public class Circle_con {
	int radios;
	String name;
	public Circle_con() {						// 생성자 (매개변수 X)
		radios = 1; name = ""; 					// radios의 초기값은 1
	}
	public Circle_con(int r, String n) {		// 생성자 (매개변수 O), 생성자는 리턴값 X
		radios = r ; name = n;
	}
	public double getArea() {
		return 3.14 * radios * radios;
	}
	

	public static void main(String[] args) {
		
		Circle_con pizza = new Circle_con (10, "자바 피자");	// 매개변수 있는 생성자 호출
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 가격은 " + area);
		
		Circle_con donut = new Circle_con ();				// 매개변수 없는 생성자 호출
		donut.name = "도넛 피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
