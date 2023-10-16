package in.com.SetGet_method;

public class TestMobile {
public static void main(String[] args) {
	M m= new M();
	m.setName("Iphone");
	m.setValue(75000);
	System.out.println(m.getName());
	System.out.println(m.getValue());
	
	Mobile r= new Mobile();
	r.setSamsung("Samsung");
	r.setPrice(85000);
	System.out.println(r.getSamsung());
	System.out.println(r.getPrice());
	
}
}