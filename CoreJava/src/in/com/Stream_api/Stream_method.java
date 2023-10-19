package in.com.Stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_method {
	public static void main(String[] args) {
		
	
	List<String> name= List.of("Ram","Raj","Rahul","Rajesh","Sagar","Himanshu");
	List <String> newname=name.stream().filter(e-> e.startsWith("R")).collect(Collectors.toList());
	 System.out.println(newname);
	 
	 List<Integer> number=List.of(1,2,3,4,1,2,3,4);
	 List<Integer> newnum=number.stream().distinct().collect(Collectors.toList());
	 System.out.println(newnum);
	 
	 List<Integer> num=List.of(1,2,3,4,5);
	 List<Integer> sqare=num.stream().map(i-> i*i).collect(Collectors.toList());
	System.out.println(sqare);
	}
}