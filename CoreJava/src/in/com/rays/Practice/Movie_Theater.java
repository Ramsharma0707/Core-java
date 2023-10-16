package in.com.rays.Practice;

import java.util.Scanner;

public class Movie_Theater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name...");
	String name=sc.next();
	System.out.println("Enter the price:");
	Double price= sc.nextDouble();
	System.out.println("Enter the code....");
	int code=sc.nextInt();
	System.out.println("Welcome the Inox");
	if(code==12) {
		price=price-(price*0.10f);
		System.out.println("congrats you have discount"+price);
	}
	else if(code==121) {
		price=price-price*0.05f;
		System.out.println("discount "+price);
	}
	else {
		System.out.println("please collect the ticket....");
	}
}
}
