package in.com.Test1;

import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
public static void main(String[] args) {
	List<String> name=List.of("ram","atul","vikas","sonu","vinay");
	List<String> newname=name.stream().filter(e-> e.startsWith("v")).collect(Collectors.toList());
	System.out.println(newname);
	
	List<Integer>num=List.of(1,2,3,4,1,2,3,4);
	List<Integer> num1=num.stream().distinct().collect(Collectors.toList());
	System.out.println(num1);
	
	List<Integer> num2=List.of(1,2,3,4);
	List<Integer>Sqare=num2.stream().map(e->e*e).collect(Collectors.toList());
	System.out.println(Sqare);
}
}
