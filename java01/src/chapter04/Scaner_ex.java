package chapter04;

import java.util.Scanner;									// 1. Scanner import

public class Scaner_ex {

	public static void main(String[] args) {

		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);			// 2. Scanner ��ü ����
		
		String name = scanner.next( );	//���ڿ� �б�			// 3. Scanner���� ���� ���� ������ �Ҵ�
		System.out.println("�̸��� " + name + ", ");
		
		String city = scanner.next( );	//���ڿ� �б�
		System.out.println("���ô� " + city + ", ");
		
		int age = scanner.nextInt();	//���� �б�
		System.out.println("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();	//�Ǽ� �б�
		System.out.println("ü���� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();	//������ �б�
		System.out.println(("���� ���δ� " + single + "�Դϴ�."));
		
		scanner.close(); 									// 4. Scanner close
		
	}

}