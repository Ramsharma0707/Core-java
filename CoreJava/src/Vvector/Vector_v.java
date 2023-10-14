package Vvector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_v {
public static void main(String[] args) {
	
	Vector v=new Vector();
	v.add(101);
	v.add(105);
	v.add(70);
	System.out.println(v);
	
	v.add(500);
	v.add(101);
	v.add("ram");
	v.add("ggg");
	System.out.println(v);
	
	
	Enumeration e=v.elements();
	v.add("mohan");
	v.add("java");
	v.add(1000);
	System.out.println();
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	
}
}
