package chapter05;

public class Circle_con {
	int radios;
	String name;
	public Circle_con() {						// ������ (�Ű����� X)
		radios = 1; name = ""; 					// radios�� �ʱⰪ�� 1
	}
	public Circle_con(int r, String n) {		// ������ (�Ű����� O), �����ڴ� ���ϰ� X
		radios = r ; name = n;
	}
	public double getArea() {
		return 3.14 * radios * radios;
	}
	

	public static void main(String[] args) {
		
		Circle_con pizza = new Circle_con (10, "�ڹ� ����");	// �Ű����� �ִ� ������ ȣ��
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle_con donut = new Circle_con ();				// �Ű����� ���� ������ ȣ��
		donut.name = "���� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		
	}

}
