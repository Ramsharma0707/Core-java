package in.com.Collection_frame;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_method {
	public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add(101);
		c.add(5);
		c.add("Ram");
		c.add('a');
		c.add(10.5);
		System.out.println(c);
		
		System.out.println("_______");
		c.add(1001);
		System.out.println(c);
		c.addAll(c);
		System.out.println(c);
		System.out.println("____");
		//c.clear();
	//	System.out.println(c);
	//c.contains(c);// puri list vapas add kr dega
		System.out.println(c.contains("Ram"));//sout me true false dega
		System.out.println(c.containsAll(c));//trur false on all element
		Collection c2 =new ArrayList();
		c2.add("ppp");
		c2.add(54);
		
	//	c2.clear();
	//	System.out.println(c);
		System.out.println("__________");
	
		System.out.println(c2.isEmpty());//t f in sout
		
		//c2.remove("ppp");// jo () isme diya use hta 
		//System.out.println(c2);
	//	c2.removeAll(c2);// sare element hta dega
		System.out.println(c2);
		c2.retainAll(c2);
		System.out.println(c2);
		
		
	System.out.println(c2.size());//size btayega kitne elemennt sout m
		
	}

}
