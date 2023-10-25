package in.com.r_practice;

import java.util.Comparator;

public class ByPhone implements Comparator<Em1> {

	@Override
	public int compare(Em1 o1, Em1 o2) {
		
		return o1.phone.compareTo(o2.phone);
	}

}
