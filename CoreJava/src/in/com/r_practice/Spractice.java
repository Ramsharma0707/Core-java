package in.com.r_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spractice {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(150);
		l.add(200);
		l.add(101);
		l.add(12);
		l.add(7);
		l.add(9);
		
		Stream<Integer> s=l.stream();
		List<Integer> newlist=s.filter(e-> e%2==1).collect(Collectors.toList());
		System.out.println(newlist);
	}

}
