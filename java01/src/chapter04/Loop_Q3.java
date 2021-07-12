package chapter04;

public class Loop_Q3 {

	public static void main(String[] args) {

		int dan;
		int time;
		
		for (dan=2 ; dan <=9 ; dan++) {
			for(time=1 ; time <=9 ; time++) {
				if(dan<time)
					break;
				System.out.println(dan + "X" + time + "=" + dan * time);
			}
			System.out.println( );
		}
		
	}

}
