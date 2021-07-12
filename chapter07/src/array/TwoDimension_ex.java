package array;

public class TwoDimension_ex {

	public static void main(String[] args) {
		
		long sum = 1L;
		
		
		int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {	
				sum *= arr[i][j];
				System.out.println(arr[i][j]);}
			System.out.println();
			
		}
		System.out.println(sum);
		
	}

}
