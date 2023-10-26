package in.com.Test1;

import java.util.Comparator;

public class Byid implements Comparator<Employ>{

	@Override
	public int compare(Employ o1, Employ o2) {
		
		return o1.id-o2.id;
	}

}
