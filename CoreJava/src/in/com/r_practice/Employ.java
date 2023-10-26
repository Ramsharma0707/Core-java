package in.com.r_practice;

import java.util.ArrayList;
import java.util.Iterator;


public class Employ {
int id;
String name;
String phone;
public Employ(int id, String name, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
}
@Override
public String toString() {
	return "Employ id=" + id + ", name=" + name + ", phone=" + phone + " ";
}
public static void main(String[] args) {
	Employ e1= new Employ(100, "raram", "84512");
	Employ e2= new Employ(85, "rakesh", "86451");
	//Employ e1= new Employ(98, "vija", "12354");
	ArrayList<Employ> ar=new ArrayList<Employ>();
	ar.add(e1);
	ar.add(e2);
	
//	//1
//	Employ e= ar.get(0);
//	System.out.println(e);
//	System.out.println(e1);
//	System.out.println(e2);
//	
	
//	2
	
// for (int i = 0; i < ar.size(); i++) {
//	 Employ e=ar.get(i);
//	 System.out.println(e);
//	 
	 
//	for (Object em : ar) {
//		Employ e= (Employ) em;
//		System.out.println(e);
//	}

	Iterator it= ar.iterator();
	while (it.hasNext()) {
		Employ e= (Employ) it.next();
		System.out.println(e);
		
	}
}	
	
}





