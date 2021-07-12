package java_1;

public class Q14 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int sum = 0;
		
		arr[0] = (int)(Math.random()*10+1);
		arr[1] = (int)(Math.random()*10+1);
		arr[2] = (int)(Math.random()*10+1);
		arr[3] = (int)(Math.random()*10+1);
		arr[4] = (int)(Math.random()*10+1);
		arr[5] = (int)(Math.random()*10+1);
		arr[6] = (int)(Math.random()*10+1);
		arr[7] = (int)(Math.random()*10+1);
		arr[8] = (int)(Math.random()*10+1);
		arr[9] = (int)(Math.random()*10+1);
		
		System.out.print("·£´ıÇÑ Á¤¼öµé ");
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + sum / (double)arr.length);
	}

}
