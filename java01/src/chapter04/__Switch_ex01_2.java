package chapter04;

public class __Switch_ex01_2 {

	public static void main(String[] args) {

		String  medal = "d";
		String medalc  ;
		
		if ( medal == "Gold" || medal == "G" || medal =="g") {
			medalc = "��";
		}	
		else if	(medal == "Silver" || medal == "S" || medal =="s" ) {
			medalc = "��";
		}
		else if	(medal == "Bronze" || medal == "B" || medal =="b" ) {
			medalc = "��";
		}
		else { 
			medalc = "����";
		}
			System.out.println ( medalc + "�޴��Դϴ�.");	
	
	}

}
