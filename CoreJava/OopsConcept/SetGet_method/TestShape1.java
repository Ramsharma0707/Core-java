package SetGet_method;

public class TestShape1 {
	public static void main(String[] args) {
		Shape1 s=new Shape1();
		s.setBorderWidth(10);
		s.setColor("red");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
		Rectangle r=new Rectangle();
		r.setBorderWidth(20);
		r.setColor("green");
		r.setLength(20);
		r.setWidth(30);
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
	}

}
