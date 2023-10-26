package in.com.r_practice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SPractice1 {
	public static void main(String[] args) {
		List<String> name=List.of("ram","vijay","anag","manag");
		List<String> newname=name.stream().filter(e-> e.startsWith("r")).collect(Collectors.toList());
		System.out.println(newname);
		
		List<Integer> num=List.of(1,2,3,4,1,2,3,4);
		List<Integer> newnum=num.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum);
		
		List<Integer> num1=List.of(1,2,3,4);
		List<Integer> sqare=num1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(sqare);
		
	}

}
