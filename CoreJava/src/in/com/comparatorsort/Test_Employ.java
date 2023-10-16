package in.com.comparatorsort;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Employ {
public static void main(String[] args) {
	
	ArrayList<Employ> emp =new ArrayList<Employ>();
	emp.add(new Employ(5, "himan", "5879"));
	emp.add(new Employ(1, "ram", "7875"));
	emp.add(new Employ(4, "lokee", "65246255"));
	emp.add(new Employ(9, "amit", "93554"));
	System.out.println(emp);
	
	
	
	Collections.sort (emp,new Comapraebyid());//*
	System.out.println(emp);
	
	
	ArrayList<Employ> empn=new ArrayList<Employ>(emp);
	Collections.sort(empn, new CompareName());
	System.out.println(empn);
	
	ArrayList<Employ> empp=new ArrayList<Employ>(emp);
	Collections.sort(empp, new Comparebyphone());
	System.out.println(empp);
	
}
}
