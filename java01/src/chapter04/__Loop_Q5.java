package chapter04;

public class __Loop_Q5 {

	public static void main(String[] args) {

		int lineCount = 7;		//출력할 라인 수
		int starCount = 1;		//별을 출력하는 변수, 초기값 1
		int spaceCount = 3;		//공백을 처리하는 변수, 초기값 3
		
		for( int i=0 ; i < lineCount ; i++ ) {				//라인을 처리하는 for
		
			for ( int j=0 ; j < spaceCount ; j++ ) {		// 왼쪽의 공백 처리
				System.out.print(' ');
			}
			for ( int j=0 ; j < starCount ; j++ ) {			// 별표 처리
				System.out.print('◆');
			}
			for ( int j=0 ; j < spaceCount ; j++ ) {		// 오른쪽의 공백 처리
				System.out.print(' ');
			}
			if ( i < lineCount/2) {
				spaceCount -=1;
				starCount +=2;
			}
			else {
				spaceCount +=1;
				starCount -=2;
			}
			System.out.println();
		}
	}

}
	
	
