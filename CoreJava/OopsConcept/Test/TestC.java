package Test;

public class TestC {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c=new Customer("RAm",544);
	Customer c2=(Customer) c.clone();
	c2.name="fff";
	c2.a.balance=800;
	System.out.println(c.name);
	System.out.println(c.a.balance);
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
	
}
}
