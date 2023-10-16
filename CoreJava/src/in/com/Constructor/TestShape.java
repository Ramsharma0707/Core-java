package in.com.Constructor;

public class TestShape {
	public static void main(String[] args) {
		Shape s=new Shape("red",100);
		System.out.println (s.getBorderwidth());
		System.out.println(s.getColor());
		
		Shape s1= new Shape(null,0);
		s1.setColor("green");
		s1.setBorderwidth(1000);
		System.out.println(s1.Color);
		System.out.println(s1.Borderwidth);
		
	
	}
	
}
