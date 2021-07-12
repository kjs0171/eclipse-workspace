package cooperation;

public class Taxi {

	int taxiNumber;
	int money;
	int passengerCount;
	
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("차량번호 " + taxiNumber + "의 수입은 " + money + "원이고, 승객수는 " + passengerCount);
	}

		
	}

