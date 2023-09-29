package SetGet_method;

public class Rect extends Shap2 {
	private int Length;
	private int Width;
	
	public void setLength(int Length) {
		this.Length=Length;
		
	}
	public int getLength() {
		return Length;
	}
	public void setWidth(int Width) {
		this.Width=Width;
	}
	public int getWidth() {
		return Width;
	}
	public void area () {
		int Rarea=getLength()*getWidth();
		System.out.println("Rectangle =" +Rarea);
	}
}
