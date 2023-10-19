package in.com.vector;

public class Account implements Cloneable{
	int id;
	String name;
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}

}
