package in.com.r_practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmploy1 {
	public static void main(String[] args) {
		ArrayList<Employ1> ar=new ArrayList<Employ1>();
		ar.add(new Employ1(4, "manju"));
		ar.add(new Employ1(3, "sanju"));
		ar.add(new Employ1(1, "ffgju"));
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
	}

}
