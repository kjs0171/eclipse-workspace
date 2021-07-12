package chapter05.circle;

import chapter05.circle.Order;

public class Order_test {

	public static void main(String[] args) {

		Order pack;
		pack = new Order();
		pack.orderNum = 201803120001L;
		pack.oderID = "abc123";
		pack.day = "2018년 3월 12일";
		pack.name = "홍길순";
		pack.producNum = "PD0345-12";
		pack.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + pack.orderNum);
		System.out.println("주문자 아이디 : " + pack.oderID);
		System.out.println("주문 날짜 : " + pack.day);
		System.out.println("주문 상품 번호 : " + pack.producNum);
		System.out.println("배송 주소" + pack.address);
		
		
	}

}
