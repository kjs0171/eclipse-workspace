package chapter05.circle;

import chapter05.circle.Order;

public class Order_test {

	public static void main(String[] args) {

		Order pack;
		pack = new Order();
		pack.orderNum = 201803120001L;
		pack.oderID = "abc123";
		pack.day = "2018�� 3�� 12��";
		pack.name = "ȫ���";
		pack.producNum = "PD0345-12";
		pack.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + pack.orderNum);
		System.out.println("�ֹ��� ���̵� : " + pack.oderID);
		System.out.println("�ֹ� ��¥ : " + pack.day);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + pack.producNum);
		System.out.println("��� �ּ�" + pack.address);
		
		
	}

}
