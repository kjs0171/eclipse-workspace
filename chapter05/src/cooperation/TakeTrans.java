package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("tomas", 10000);
		Student studentBilly = new Student("Billy", 50000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2ȣ��");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi5583 = new Taxi(5583);
		studentBilly.takeTaxi(taxi5583);
		studentBilly.showInfo();
		taxi5583.showInfo();
		
	}
	
	
	
	

}
