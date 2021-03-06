package witharraylist;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신인수");
		Customer customerHong = new GoldCustomer(10030, "홍진호");			// 업캐스팅
		Customer customerYul = new GoldCustomer(10040, "율곡");				// 업캐스팅
		Customer customerKim = new VIPCustomer(10050, "김순종", 12345);		// 업캐스팅
		
		customerList.add(customerLee);		// 0
		customerList.add(customerShin);		// 1
		customerList.add(customerHong);		// 2
		customerList.add(customerYul);		// 3
		customerList.add(customerKim);		// 4
		
		System.out.println("========= 고객 정보 출력 =========");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		for (Customer customer : customerList) { 
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다." );
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}
