package inheritance;

public class ColorPoint extends Point{			// 부모 : Point, 자식 : ColorPoint
	
	private String color;						// 점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColerPoint() {
		System.out.print(color);
		showPoint();							// point 클래스의 메소드 호출
	}
	/*
	public static void main(String[] args) {
		
		Point p = new Point();
		p.x = 1;
		p.y = 2;
		
	}*/
}
