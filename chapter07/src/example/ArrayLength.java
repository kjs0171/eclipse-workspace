package example;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length + "���� ������ �Է��ϼ��� > ");
		for(int i = 0; i < intArray.length; i++) 
			intArray[i] = scanner.nextInt();
					
		for(int i = 0; i < intArray.length; i++)
			sum += intArray[i];
		
		double ave = sum/intArray.length;
		System.out.println("����� " + ave);	
		
		
		
	}

}
