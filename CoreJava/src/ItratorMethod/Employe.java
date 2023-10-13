package ItratorMethod;

public class Employe {
int eid;
String name;
String department;
int salary;
public Employe(int eid, String name, String department, int salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employe [eid=" + eid + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}

}
