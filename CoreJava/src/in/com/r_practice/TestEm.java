package in.com.r_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEm {
public static void main(String[] args) {
	ArrayList<Em> e1= new ArrayList<Em>();
	e1.add(new Em(1, "Ram", "78945"));
	e1.add(new Em(2, "sagar", "987456"));
	e1.add(new Em(5, "dilip", "78566555"));
	e1.add(new Em(4, "hardeep", "984652"));
	System.out.println(e1);
	Collections.sort(e1);
	System.out.println(e1);
	
}
}
