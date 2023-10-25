package in.com.r_practice;

import java.util.Comparator;

public class Byid implements Comparator<Em1>{

	@Override
	public int compare(Em1 o1, Em1 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
	

}
