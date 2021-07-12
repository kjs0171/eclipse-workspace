package inheritance06;

public class VIPCustomer extends Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		//super;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
