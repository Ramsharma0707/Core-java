package in.com.Test1;

import java.util.Comparator;

public class Byaddress implements Comparator<Employ>{

	@Override
	public int compare(Employ o1, Employ o2) {
		
		return o1.address.compareTo(o2.address);
	}

}
