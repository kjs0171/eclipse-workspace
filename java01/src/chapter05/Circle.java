package chapter05;

public class Circle {
	
	int radios;		//���� ������
	String name;	//���� �̸�
	
	public Circle() {} 		//Circle Ŭ������ �⺻ ������(Ŭ���� �̸��� ���� �̸��� ���� �޼ҵ�)
							//��ǲ �Ű������� ����, ����ε� ���� ������ : �⺻ ������(���� ����)
	
	public double getArea() {
		return 3.14 * radios * radios;
	}

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle();			//Circle ��ü ����, ���۷��� �̸� pizza
		pizza.radios = 10;				//������ �������� 10���� ����
		pizza.name = "�ڹ� ����";			//���ڤ� �̸��� ����
		double area = pizza.getArea();	//���� ���� (getArea()�� ȣ���ؼ� area ������ �Ҵ�
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();	//Circle ��ü ����, ���۷��� �̸� donut
		donut.radios = 2;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name +"�� ������ " + area);
		
	}

}
