package inheritance06;

public class VIPCustomerOLD extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD() {
		//super();				
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	} 
}
