package array;

public class BookArray2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];				// Book ��ü �迭�� ���� 5�� ����
		
		library[0] = new Book("�¹���", "������");	// new ������ ȣ��
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���δ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
