	package in.com.Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_method1 {
	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(107);
		a.add(80);
		a.add(207);
		
		Stream<Integer> s1= a.stream();
		List<Integer> obj=s1.filter(r-> r%2==1).collect(Collectors.toList());
		System.out.println(obj);
	}
}
