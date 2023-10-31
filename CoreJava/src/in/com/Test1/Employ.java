package in.com.Test1;

public class Employ {
int id;
String name;
String address;

public Employ(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Employ id=" + id + ", name=" + name + ", address=" + address + "";
}


}
