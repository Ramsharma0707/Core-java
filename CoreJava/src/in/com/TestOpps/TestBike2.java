package in.com.TestOpps;

 class TestBike21 extends InheritanceBike {
	int price1=90000;
}
	class TestBike3 extends TestBike21{
	int ppprice=78000;
	String ccolor="blue";
	}
	public class TestBike2{
	public static void main(String[] args) {

	
 InheritanceBike b=new InheritanceBike();
 System.out.println(b.price);
 System.out.println(b.color);
 
 TestBike21 b1=new TestBike21();
 System.out.println(b1.price);
 System.out.println(b1.color);
 System.out.println(b1.price1);
 
 TestBike3 b3=new TestBike3();
 System.out.println(b3.color);
 System.out.println(b3.price1);
 System.out.println(b3.price);
 System.out.println(b3.ppprice);
 System.out.println(b3.ccolor);
 
	}
}
