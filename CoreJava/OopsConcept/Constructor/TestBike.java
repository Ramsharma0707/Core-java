package Constructor;

import java.util.Scanner;

public class TestBike {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter color");
		String Color=sc.next();
		
		System.out.println("Enter price");
		int price=sc.nextInt();
		
		Bike b=new Bike(Color,price, price);
		System.out.println("bike color is=" +b.getColor());
		System.out.println("price =" +b.getPrice());
	}
}
