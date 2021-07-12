package chapter04;

public class Loop_Q2 {

	public static void main(String[] args) {

		int dan;
		int time;
		
		for (dan=2 ; dan <=9 ; dan++) {
			if( dan % 2 == 1)
				continue;
			for(time=1 ; time <=9 ; time++) {
				System.out.println(dan + "X" + time + "=" + dan * time);
			}
			System.out.println( );
		}
		
	}

}
