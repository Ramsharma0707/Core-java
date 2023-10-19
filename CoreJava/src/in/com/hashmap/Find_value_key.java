package in.com.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Find_value_key {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	ArrayList<String>a1=new ArrayList<>();
	LinkedHashMap<Integer, String> lhmp= new LinkedHashMap<>();
	hm.put(123, "zrahul");
	hm.put(1234, "Ram");
	hm.put(345, "sagar");
	hm.put(567, "wraju");
	Collection <String> c1=hm.values();
	Iterator<String> it=c1.iterator();
	while(it.hasNext()) {
		String s=it.next();
		a1.add(s);
	}
	
	Collections.sort(a1);
	Iterator<String> it1=a1.iterator();
	while(it1.hasNext()) {
		String s1=it1.next();
		Set<Entry<Integer,String>>set=hm.entrySet();
		for(Map.Entry<Integer,String>map:set) {
			String s2=map.getValue();
			if(s2.equals(s1)) {
				Integer i=map.getKey();
				
			}
		}
	}
}
}
