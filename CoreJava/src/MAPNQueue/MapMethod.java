package MAPNQueue;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
public static void main(String[] args) {
	Map<String, Integer> num=new HashMap<String, Integer>();
	num.put("One", 1);
	num.put("two",2);
	num.put ("three",3);
	num.put("four",4);
	System.out.println(num);
	//num.clear();
	//System.out.println(num);
	
	System.out.println(num.containsKey("One"));
	System.out.println("_______________");
	
	System.out.println(num.containsValue("2"));//smjna
	System.out.println(num.entrySet()); //give both key=value
	
	System.out.println(num.get("two"));// give its value of value
		
	System.out.println("___________");
	System.out.println(num.isEmpty());//true false
	System.out.println(num.keySet());//key value sari one two
	System.out.println("_:::::::::::::::");
	System.out.println(num.put("ten", 10));//key ,value add kr dega jo denge wo
	
	
	num.remove("two");// ye key or value remove kr dega dena key value hi "two"
	System.out.println(num);
	
//	num.size();
	System.out.println(num.size());
	num.values();// key=value print
	System.out.println(num);
	
}
}
