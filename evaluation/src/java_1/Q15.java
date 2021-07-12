package java_1;

public class Q15 {

	public static void main(String[] args) {
		
		
		int n;
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				n = i*10 + j;
				
				if (i== 0 && j == 0)
					continue;
				if (i%3 != 0 && j == 0)
					continue;
				if (i == 0 && j%3 != 0)
					continue;
				if (i%3 != 0 && j%3 != 0)
					continue;
				if (i%3 == 0 && j%3 == 0 && i !=0 && j != 0) 
					System.out.println( n + "¹Ú¼ö Â¦Â¦");
				if 	(i%3 == 0 && j%3 == 0 && i !=0 && j != 0)
					continue;
				if (i%3 == 0 || j%3 == 0)
					System.out.println( n + "¹Ú¼ö Â¦");
			}
		}
	}
}
