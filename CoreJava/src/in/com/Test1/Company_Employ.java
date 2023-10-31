package in.com.Test1;

public class Company_Employ implements Cloneable {
String name;
String address;
Company1 c=new Company1();
public Company_Employ(String name, String address, int id) {
	super();
	this.name = name;
	this.address = address;
	this.c.id = id;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		Company_Employ Ce= (Company_Employ) super.clone();
		Ce.c=(Company1) c.clone();
		return Ce;
	} 

	}


