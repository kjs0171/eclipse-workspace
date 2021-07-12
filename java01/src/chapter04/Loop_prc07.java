package chapter04;

import java.util.Scanner;

public class Loop_prc07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요.");
		String menu = scanner.next();
		int price=0;
				
		switch (menu) {
		case "카푸치노" : case "카페라떼" :
			price = 3500;
			break;
		case "아메리카노" :
			price = 2000;
			break;
		case "카페모카" :
			price = 4000;
			break;
		default :
			System.out.println("메뉴에 없습니다.");
		}
		if(price != 0) {
		System.out.println(menu + "의 가격은 " + price + "입니다.");
		}
		scanner.close();
	}

}
