package chapter04;

public class __Loop_Q5 {

	public static void main(String[] args) {

		int lineCount = 7;		//����� ���� ��
		int starCount = 1;		//���� ����ϴ� ����, �ʱⰪ 1
		int spaceCount = 3;		//������ ó���ϴ� ����, �ʱⰪ 3
		
		for( int i=0 ; i < lineCount ; i++ ) {				//������ ó���ϴ� for
		
			for ( int j=0 ; j < spaceCount ; j++ ) {		// ������ ���� ó��
				System.out.print(' ');
			}
			for ( int j=0 ; j < starCount ; j++ ) {			// ��ǥ ó��
				System.out.print('��');
			}
			for ( int j=0 ; j < spaceCount ; j++ ) {		// �������� ���� ó��
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
	
	
