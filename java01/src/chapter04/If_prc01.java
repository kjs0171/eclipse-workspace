package chapter04;

public class If_prc01 {

	public static void main(String[] args) {

		int age = 5;
		int charge;
		
		if (age < 8) {
			charge = 0;
			System.out.println("�����оƵ��Դϴ�.");
		}
		else if (age < 14) {
			charge = 1000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if (age < 20) {
			charge = 2000;
			System.out.println("û�ҳ��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("���δմϴ�.");
		}
		System.out.println("����� " + charge + "�Դϴ�.");
	}

}
