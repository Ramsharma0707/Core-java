package in.com.r_practice;

import java.util.ArrayList;
import java.util.Collections;

import in.com.comparatorsort.Employ;

public class TestEmploy3 {
 public static void main(String[] args) {
	ArrayList<Employ3> emp=new ArrayList<Employ3>();
	emp.add(new Employ3 (2,"ram","21354"));
	emp.add(new Employ3(1, "mahesg", "15468"));
	emp.add(new Employ3(3, "aahesg", "468"));
	
	Collections.sort(emp,new Byid());
	System.out.println(emp);
	
	//ArrayList<Employ3> Empn=new ArrayList<Employ3> (emp);
	//Collections.sort(Empn, new ByName());
	//System.out.println(Empn);
	Collections.sort(emp,new ByName());
	System.out.println(emp);
	ArrayList<Employ3> empn1=new ArrayList<Employ3>(emp);
	Collections.sort(empn1,new ByPhone());
	System.out.println(empn1);
	
}
}
