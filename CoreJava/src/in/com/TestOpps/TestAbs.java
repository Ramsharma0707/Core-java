package in.com.TestOpps;

public class TestAbs {
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.area();
	//r.h();
	
	AbstractMethod am=new AbstractMethod() {
		
		@Override
		public void area() {
			int a=80;
			int b=50;
			int c=a-b;
			System.out.println(c);
		System.out.println("This overrride for show to sagar ");
			
		}
	};
	am.h();
	am.area();
}
}
