package hiding;

public class Sample {
	
	public int a;		// 다른 패지키 클래스에서 접근 가능
	private int b;		// 클래스 내애서만 접근 가능
	int c;				// (default) 같은 패키키 내에서만 접근 가능

	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

	
}
