package in.com.r_practice;

import java.util.ArrayList;
import java.util.Iterator;

import in.com.rays.Practice.ForEach;

public class It {
 public int id;
 String name;
 String address;
public It(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
 
	@Override
		public String toString() {
	
			return id+" "+name+" "+address;
		}
	public static void main(String[] args) {
		It e1=new It(101, "raj", "indore");
		It e2=new It(2, "raju", "Ujjain");
		
		ArrayList ar=new ArrayList();
		ar.add(e1);
		ar.add(e2);
		
//		It e=(It) ar.get(0);
//		System.out.println(e);
//		System.out.println(e2);
//		System.out.println(e.id);
//		System.out.println(e.name);
//		System.out.println(e.address);
        
//		for (int i = 0; i < ar.size(); i++) {
//			It e=(It) ar.get(i);
//			System.out.println(e);
//		}
		
//		for (Object ob : ar) {
//			It e=(It) ob;
//			System.out.println(e);
//		}
		
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			It t=(It) it.next();
			System.out.println(t);
			
		}
		
	}
	}
 

