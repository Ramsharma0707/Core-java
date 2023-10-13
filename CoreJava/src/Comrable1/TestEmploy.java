package Comrable1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmploy {
public static void main(String[] args) {
	ArrayList<Employ> e1= new ArrayList<Employ>();
	e1.add(new Employ (1,"Ankit","5478"));
	e1.add(new Employ(5,"rahul","7895"));
	e1.add(new Employ (2,"sagar","8975"));
	e1.add(new Employ (9,"titu","2146"));
	System.out.println(e1);
	Collections.sort(e1);
	System.out.println(e1);
//	
//	Iterator<Employ> it= e1.iterator();// line by line 
//	while(it.hasNext()) {
//	Employ em=it.next();
//	System.out.println(em);
//	}
}
}
