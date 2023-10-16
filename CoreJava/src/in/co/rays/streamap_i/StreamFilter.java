package in.co.rays.streamap_i;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
public static void main(String[] args) {
	List <Integer> l= new ArrayList<Integer>();
	l.add(50);
	l.add(101);
	l.add(49);
	l.add(87);
	l.add(150);
	l.add(27);
	System.out.println(l);
	
	
	List<Integer> even=new ArrayList<Integer>();
	for (Integer i : l) { // datatype object - d(l ki value copy karwayi d m) : l jiski value copy krna
		if(i%2 ==0) {
			even.add(i);
		}
	}
		System.out.println(even);
	
	Stream<Integer> s1= l.stream();
	List<Integer> odd=s1.filter(e-> e%2==1).collect(Collectors.toList());
	System.out.println(odd);
	 
	Stream<Integer> s2=l.stream();
	List<Integer> gt=s2.filter(e-> e>=50).collect(Collectors.toList());
	System.out.println(gt);
	
}
}
