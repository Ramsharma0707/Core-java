package in.com.data;

public class Account_cl implements Cloneable {
	int balance;
    String name;
	public Account_cl(int balance, String name) {
		super();
		this.balance = balance;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
