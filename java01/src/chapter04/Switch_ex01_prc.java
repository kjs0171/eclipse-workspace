package chapter04;

public class Switch_ex01_prc {

	public static void main(String[] args) {

		int ranking = 2;
		char medalColor;
		
		switch (ranking) {
		case 1 : medalColor = '��';
			break;
		case 2 : medalColor = '��';
			break;
		case 3 : medalColor = '��';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������ " + medalColor +"�Դϴ�.");
		
	}

}
