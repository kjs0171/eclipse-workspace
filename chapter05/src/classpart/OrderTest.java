package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order pack = new Order();
		pack.orderNum = 201803120001L;
		pack.orderID = "abc123";
		pack.orderDate = "2018�� 3�� 12��";
		pack.orderName = "ȫ�浿";
		pack.productNum = "PD0345-12";
		pack.orderaddress = "����� �������� ���ǵ��� 20����";
				
		System.out.println("�ֹ���ȣ : " + pack.orderNum);
		System.out.println("�ֹ��� ���̵� : " + pack.orderID);
		System.out.println("�ֹ� ��¥" + pack.orderDate);
		System.out.println("�ֹ��� �̸� : " + pack.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + pack.productNum);
		System.out.println("��� �ּ� : " + pack.orderaddress);
		
		
	}

}
