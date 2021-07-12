package java_1;

public class For {

	public static void main(String[] args) {
		
		int lineCount = 4;
		int starCount = 1;
		int spaceCount = 3;
		
		for(int i = 0 ; i < lineCount ; i++) {
			for(int j = 0; j < starCount ; j++)
			System.out.print('*');
			for(int j = 0; j < spaceCount ; j++)
				System.out.print(" ");
			
			starCount += 1;
			spaceCount -= 1;
			System.out.println();
		}
	}

}
