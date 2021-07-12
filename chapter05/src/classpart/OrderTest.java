package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order pack = new Order();
		pack.orderNum = 201803120001L;
		pack.orderID = "abc123";
		pack.orderDate = "2018년 3월 12일";
		pack.orderName = "홍길동";
		pack.productNum = "PD0345-12";
		pack.orderaddress = "서울시 영등포구 여의도동 20번지";
				
		System.out.println("주문번호 : " + pack.orderNum);
		System.out.println("주문자 아이디 : " + pack.orderID);
		System.out.println("주문 날짜" + pack.orderDate);
		System.out.println("주문자 이름 : " + pack.orderName);
		System.out.println("주문 상품 번호 : " + pack.productNum);
		System.out.println("배송 주소 : " + pack.orderaddress);
		
		
	}

}
