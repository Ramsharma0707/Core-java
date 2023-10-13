package ItratorMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingS1 {
	public static void main(String[] args) {
		
	
ArrayList <String> al=new ArrayList<>();
List<String> l=new ArrayList<>();
 al.add("Ram");
 al.add("Alex");
 al.add("Box");
 al.add("zebra");
 
 Iterator<String> it=al.iterator();
 while(it.hasNext()) {// element se value lata h
	 String s1=it.next();
	 l.add(s1);
	 
	 System.out.println(s1);
 }
 Collections.sort(l);
 System.out.println(l);
}}
