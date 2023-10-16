package in.com.SetGet_method;

public class TestShape {
	public static void main(String[] args) {
		Shape ee=new Shape();
		ee.setColor("blue");
		ee.setBorder(100);
		String st= ee.getColor();
		System.out.println(st);
	//	System.out.println(ee.getColor());
		System.out.println(ee.getBorder());
	}

}
