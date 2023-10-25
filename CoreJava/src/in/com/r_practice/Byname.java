package in.com.r_practice;

import java.util.Comparator;

public class Byname implements Comparator<Em1>{

	@Override
	public int compare(Em1 o1, Em1 o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
