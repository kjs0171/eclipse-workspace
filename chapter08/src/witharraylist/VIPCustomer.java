package witharraylist;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//super();
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// VIP 고객일 경우 가격 할인
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() +" 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
