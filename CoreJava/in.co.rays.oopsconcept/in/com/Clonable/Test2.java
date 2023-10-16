package in.com.Clonable;

public class Test2 {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer2 c2= new Customer2("Ramm",5000); 
	Customer2 c3=(Customer2) c2.clone();
	c3.name="dilip";
	c3.a2.balance=8000;
	
	System.out.println(c2.name);
	System.out.println(c2.a2.balance);
	System.out.println(c3.name);
	System.out.println(c3.a2.balance);
}
}
