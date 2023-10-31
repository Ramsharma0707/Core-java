package in.com.Practice_opps;

public class TestShape1_rect {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		r.Hello();
		
		Shape1 s1=new Shape1() {
			
			@Override
			public void area() {
				System.out.println("this is shape area");
				
			}
		};
		s1.area();
		s1.Hello();
	}

}
