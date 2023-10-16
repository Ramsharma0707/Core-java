package in.co.rays.comparatorsort;

import java.util.Comparator;

public class CompareName implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
