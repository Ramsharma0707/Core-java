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
	
	System.out.println(num.containsValue(1));
	System.out.println(num.entrySet()); //give both key=value
	
	System.out.println(num.get("two"));// give its value 
		
	System.out.println("___________");
	System.out.println(num.isEmpty());
	System.out.println(num.keySet());//key value
	
	System.out.println(num.put("Two", 2));//smjna
	
	num.remove("two");
	System.out.println(num);
	
//	num.size();
	System.out.println(num.size());
	
}
}
