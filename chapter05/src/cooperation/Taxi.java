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
		System.out.println("������ȣ " + taxiNumber + "�� ������ " + money + "���̰�, �°����� " + passengerCount);
	}

		
	}

