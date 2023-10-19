package in.com.itratormethod;

public class Employee {
private int id=0;
private String name=null;
private String address=null;

public Employee(int id,String name,String address) {
	this.id=id;
	this.name=name;
	this.address=address;
	
}
@Override
	public String toString() {
		
		return id+ " " +name+ " "+ " "+address;
	}
@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) {
		return false;
	}
		
		Employee e=(Employee) obj;
		boolean b=this.id==e.id && this.name==e.name && this.address==e.address;
		return b;
}
public int hashcode() {
	String str=id+name+address;
	return str.hashCode();
}
}
