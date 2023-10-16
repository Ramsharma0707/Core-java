package SetGet_method;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your name");
	String CName=sc.next();
	System.out.println("Enter acc no");
	int Account_no=sc.nextInt();
	System.out.println("enter amount");
	int Balance=sc.nextInt();
	
	Account ac=new Account(CName,Account_no,Balance);
	System.out.println("name"+ac.getCName());
	System.out.println("account no"+ac.getAccount_no());
	System.out.println("balance"+ac.getBalance());
	}

}



//Account acc=new Account();
//acc.setCName("Ram");
//acc.setAccount_no(34948524);
//acc.setBalance(5000000);
//System.out.println(acc.getCName());
//System.out.println(acc.Account_no);
//System.out.println(acc.Balance);