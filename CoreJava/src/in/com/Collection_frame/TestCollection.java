package in.com.Collection_frame;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
	Collection c= new ArrayList();
	c.add(1);
	c.add(5);
	c.add("lav");
//	c.add('w');
	c.add(10.55);
//	c.add(1000);
	System.out.println(c);
//	
//	
	c.addAll(c);
	System.out.println(c);
//	
//	
//  	c.clear();
//	 System.out.println(c);
//	
//	
	c.contains(c);
	System.out.println(c.contains("lav"));
	System.out.println(c.contains("fff"));
//	
//	
//	
//	
	Collection c2=new ArrayList();
	c2.add("fff");
	c2.add("collect");
	c2.add(555);
	c2.addAll(c);
	System.out.println(c2);
//	
//	
    c2.containsAll(c);
	System.out.println(c2.containsAll(c));

	
	//	//System.out.println(c2.isEmpty());
//	//c2.isEmpty();
//	//System.out.println(c2.isEmpty());
//	
     c.remove(c2);
	System.out.println(c);
//	
//	c2.remove("collect" );// y dekhna 
//	System.out.println(c2);
//	
	c.retainAll(c);
	System.out.println(c);
	System.out.println("______________");
	c2.retainAll(c2);
	System.out.println(c2);
//	
//	
//	
	System.out.println(c.size());
	System.out.println(c2.size());
  }
	}

