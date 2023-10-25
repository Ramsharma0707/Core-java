package in.com.r_practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmm {
public static void main(String[] args) {
	ArrayList<Em1> emp=new ArrayList<Em1>();
	emp.add(new Em1(5, "ramm", "6544654"));
	emp.add(new Em1(2, "ayaar","6467447"));
	emp.add(new Em1(1, "safar", "46464343"));
	System.out.println(emp);
	Collections.sort(emp, new Byid());
	System.out.println(emp);
	
	
	
	Collections.sort(emp, new Byname());
	System.out.println(emp);
	
	Collections.sort(emp, new ByPhone());
	System.out.println(emp);
	
}
}
