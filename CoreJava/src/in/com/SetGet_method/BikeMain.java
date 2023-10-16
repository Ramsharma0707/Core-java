package in.com.SetGet_method;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bike color :");
		String Color=sc.next();
		System.out.println("Enter prize");
		int Prize=sc.nextInt();
		System.out.println("Enter average");
		int Average=sc.nextInt();
		
		Bike b=new Bike(Color, Prize,Average);
		System.out.println("bike color is :"+b.getColor());
		System.out.println("prize of bike:"+b.getPrize());
		System.out.println("averahe of bike:"+b.getAverage());
	}

}
