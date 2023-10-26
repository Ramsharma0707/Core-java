package in.com.Test1;

import java.util.ArrayList;
import java.util.Collections;

import in.com.comparatorsort.Comapraebyid;
import in.com.r_practice.ByName;

public class TestEmploy {
public static void main(String[] args) {
	ArrayList<Employ> emp=new ArrayList<Employ>();
	emp.add(new Employ(5, "ram", "indore"));
	emp.add(new Employ(10, "lavish", "ujjain"));
	emp.add(new Employ(1, "sonu", "bhopal"));
	
	System.out.println(emp);
	

	Collections.sort(emp,new Byid());
	System.out.println(emp);
	
	Collections.sort(emp, new Byname());
	System.out.println(emp);
	
	Collections.sort(emp, new Byaddress());
	System.out.println(emp);
	
}
}
