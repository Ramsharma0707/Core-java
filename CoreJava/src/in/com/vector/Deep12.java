package in.com.vector;

public class Deep12 implements Cloneable {
	String name;
	int balance;
	Deep1 d=new Deep1(0);
	public Deep12(String name, int balance, int  id) {
		super();
		this.name = name;
		this.balance = balance;
		this.d.id = id;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	Deep12 w=(Deep12) super.clone();
	w.d=(Deep1) d.clone();
	return w;
}	
	}


