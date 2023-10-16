package in.com.rays.itrator;

import java.util.ArrayList;
import java.util.Iterator;



public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(101,"RAjjj","indore");
	Employee e2=new Employee(105,"vikas","bhopl");
	
	ArrayList list=new ArrayList();
	list.add(e1);
	list.add(e2);
//	System.out.println(list);
//	System.out.println(list.get(0));
//	System.out.println(list.get(1));
	
	
	Employee e=(Employee) list.get(0);
	
	
	//System.out.println(e);
	//System.out.println(e.getId());
	//System.out.println(e.getName());
	//System.out.println(e.getAddress());
	
	
	//type 1
//	for (int i = 0; i < list.size(); i++) {
//		Employee e5=(Employee) list.get(i);
//		System.out.println(e);
	
	
	//type 2
//	for (Object obj : list) {
//		Employee e4=(Employee) obj;
//		System.out.println(e4);
//	}

	Iterator it = list.iterator();
	while(it.hasNext()) {
		Employee em=(Employee) it.next();
		System.out.println(em);
	}
	
	}
}

