package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		int i = 10;
		double d = 2.0;
		
		System.out.println(i+d);				// 묵시정 변환
		
		System.out.println((int)( i + d ));		// 명시적 변환
		System.out.println((int)( i - d ));
		System.out.println((int)( i * d ));
		System.out.println((int)( i / d ));

	}

}
