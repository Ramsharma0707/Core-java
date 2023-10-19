package in.com.itratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class Emp_1 {
		
public static void main(String[] args) {
	//Emp_1 em= new Emp_1 ();
	Check ch=new Check();
	Employe e=new Employe(101,"sham", "it",12000);
	Employe e1=new Employe(102, "Sham","hr", 13000);
	Employe e2=new Employe (103,"ram","it",15000);
	Employe e3=new Employe(109,"alex","testing",15000);
	Company1 c=new Company1 ("hcl","noida",e);
	Company1 c1=new Company1 ("infosys","noida",e1);
	Company1 c2=new Company1 ("hcl","indore",e2);
	Company1 c3=new Company1("maicrosoft", "indore", e3);
	
	ArrayList<Company1>a1=new ArrayList<>();//y or iske niche
	a1.add(c);
	a1.add(c1);
	a1.add(c2);
	a1.add(c3);
	System.out.println("Searching city wise");
	ch.checkCity(a1);
	System.out.println("____________");
	System.out.println("searching company namewise");
	ch.checkCompany(a1);
	System.out.println("searching employ name");
	ch.checkName(a1);
}
}
