package chapter04;

public class __Switch_ex01_2 {

	public static void main(String[] args) {

		String  medal = "d";
		String medalc  ;
		
		if ( medal == "Gold" || medal == "G" || medal =="g") {
			medalc = "금";
		}	
		else if	(medal == "Silver" || medal == "S" || medal =="s" ) {
			medalc = "은";
		}
		else if	(medal == "Bronze" || medal == "B" || medal =="b" ) {
			medalc = "동";
		}
		else { 
			medalc = "없는";
		}
			System.out.println ( medalc + "메달입니다.");	
	
	}

}
