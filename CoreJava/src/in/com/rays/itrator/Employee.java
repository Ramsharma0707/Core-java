package in.com.rays.itrator;

public class Employee {
private int id=0;
private String name=null;
private String address=null;
public Employee(int id,String name,String address) {//constructor 
	this.id=id;
	this.name=name;
	this.address=address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 public String toString() {
	return id+"  " +name+"  "+address;
}
}
