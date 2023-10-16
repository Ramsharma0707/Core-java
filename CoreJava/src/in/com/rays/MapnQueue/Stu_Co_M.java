package in.com.rays.MapnQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Stu_Co_M {
public static void main(String[] args) {
	Student1 s= new Student1(100,"ram","indore");
	Student1 s1= new Student1(101,"loko","Ujain");
	Student1 s2= new Student1(102,"rahu","dewas");
	Course1 c1=new Course1(100,"java",1200);
	Course1 c2=new Course1(200, "c", 500);
	
	HashMap<Student1,Course1>hm= new HashMap<>();
	hm.put(s, c1);
	hm.put(s1,c2);   
	hm.put(s2, c2);
	
	Set<Entry<Student1,Course1>> set=hm.entrySet();
	for(Entry<Student1, Course1>map:set) {
		Student1 st=map.getKey();
		Course1 co=map.getValue();
		
		if(co.cname.equals("c")) {
			System.out.println(st.name+" "+st.id+" "+" "+st.Location);
		}
	}
}
}
