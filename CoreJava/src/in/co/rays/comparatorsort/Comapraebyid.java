package in.co.rays.comparatorsort;

import java.util.Comparator;

public class Comapraebyid implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		
		return o1.emid-o2.emid;
	}

}
