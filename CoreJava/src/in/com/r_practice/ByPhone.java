package in.com.r_practice;

import java.util.Comparator;

public class ByPhone implements Comparator<Employ3> {

	@Override
	public int compare(Employ3 o1, Employ3 o2) {
		
		return o1.phone.compareTo(o2.phone);
	}
	

}
