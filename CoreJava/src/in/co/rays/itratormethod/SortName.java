package in.co.rays.itratormethod;

import java.util.Comparator;

public class SortName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.name.compareTo(o1.name);
	}

}
