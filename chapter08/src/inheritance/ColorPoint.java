package inheritance;

public class ColorPoint extends Point{			// �θ� : Point, �ڽ� : ColorPoint
	
	private String color;						// ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColerPoint() {
		System.out.print(color);
		showPoint();							// point Ŭ������ �޼ҵ� ȣ��
	}
	/*
	public static void main(String[] args) {
		
		Point p = new Point();
		p.x = 1;
		p.y = 2;
		
	}*/
}