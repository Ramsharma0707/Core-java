package in.com.Clonable;

public class Customer2 implements Cloneable {
	String name;
	Account2 a2=new Account2();
	public Customer2(String name,int balance) {
		this.name=name;
		this.a2.balance=balance;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
Customer2 c=	(Customer2) super.clone();
	return c;
}
}

