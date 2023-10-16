package in.com.SetGet_method;

import java.util.Scanner;

public class Atm_machine {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int balance=1000;
	int pin=7898;
	System.out.println("Enter user name:");
	String username=sc.next();
	System.out.println("Enter you pin");
	int u_pin=sc.nextInt();
	System.out.println("Welcome to Sbi:-");
	System.out.println("Welcome......"+username);
	int choice=0;
	if(pin==u_pin) {
	do {
		System.out.println("1 Withraw");
		System.out.println("2 Deposit");
		System.out.println("3 check balance");
		System.out.println("Exit");
		System.out.println("Enter your choice!!!");
	
	 choice=sc.nextInt();
	switch(choice) {
	case 1:{
		System.out.println("Withraw amount");
		int withraw=sc.nextInt();
		if(withraw>balance) {
			System.out.println("Balance kam hai");
		}
		else {
			balance=balance-withraw;
			System.out.println("succesfully withraw amount");
			System.out.println("plz check withraw");
		}
		break;
	}
	case 2:{
		System.out.println("Enter your amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("succesfully deposit your amount");
		System.out.println("check amount after deposit");
		break;
	}
	case 3:{
		System.out.println("your balance...." +balance);
		break;
		}
	case 4:{
		System.exit(0);
	}
	}
	}while(choice!=4);
	}
	else {
		System.out.println("plz check your password");
	}
	
}
}
	