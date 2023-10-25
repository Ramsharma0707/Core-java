package in.com.Collection_frame;

import java.util.ArrayList;
import java.util.Iterator;


class Emp {
int id;
String name;
int salary;
public Emp(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp1223 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
public class Emp1223{
	ArrayList<Emp> a1=new ArrayList<Emp>();
	public void maxsalary(	ArrayList<Emp> a1) {
		Iterator<Emp> it=a1.iterator();
		while (it.hasNext()) {
			Emp e=it.next();
			if(e.salary>10000) {
				System.out.println(e.id+"   "+e.name+"   "+e.salary);
			}
		}
		
	}
	public void search(ArrayList<Emp>a1) {
		boolean s=true;
		Iterator<Emp> it=a1.iterator();
		while(it.hasNext()) {
			Emp e2=it.next();
					if(e2.name.equals("Sachin")) {
						System.out.println("emp is present    "+s);
					}
		}
	}

	
	
	public static void main(String[] args) {

			
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(2, "Sachin", 10004));
		a1.add(new Emp(1, "sagar", 17000));
		a1.add(new Emp(5, "Rahul", 25000));
		a1.add(new Emp(4, "saggar", 40));
		a1.add(new Emp(8, "vikash", 9000));
		
		Emp1223 e1=new Emp1223();
		e1.maxsalary(a1);
		e1.search(a1);
	}

}	

