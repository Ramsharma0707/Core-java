package SetGet_method;

import java.util.Scanner;

public class Test_en {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	String Company=sc.next();
	int pincode=sc.nextInt();
	Double Avgsal=sc.nextDouble();
	
En e=new En();
/*	e.setCompany("Tcs");
	e.setPincode(453551);
	e.setAvgSal(250000);*/
	System.out.println("company name is "+e.getCompany());
	System.out.println("COMPANY area code:-  "+e.getPincode());
	System.out.println("Average salary of employ :- "+e.getAvgsal());
}
}