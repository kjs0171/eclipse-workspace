package chapter04;

import java.util.Scanner;

public class Loop_prc07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴��� �������ּ���.");
		String menu = scanner.next();
		int price=0;
				
		switch (menu) {
		case "īǪġ��" : case "ī���" :
			price = 3500;
			break;
		case "�Ƹ޸�ī��" :
			price = 2000;
			break;
		case "ī���ī" :
			price = 4000;
			break;
		default :
			System.out.println("�޴��� �����ϴ�.");
		}
		if(price != 0) {
		System.out.println(menu + "�� ������ " + price + "�Դϴ�.");
		}
		scanner.close();
	}

}
