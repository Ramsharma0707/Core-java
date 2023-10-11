package in.com.Clonable;

public class Test1 {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1=new Customer("Ram",500);
	Customer c2=(Customer) c1.clone();
	c2.name="lavish";
	c2.ac.balance=122;
	System.out.println(c1.name);
	System.out.println(c1.ac.balance);
	System.out.println(c2.name);
	System.out.println(c2.ac.balance);
}
}
