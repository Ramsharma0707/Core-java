package Exceptionnnnn;

import java.util.Scanner;

public class ArrayExcep extends RuntimeException {
public ArrayExcep() {
	super();
}
void search(int s) {
	int arr[]= {1,2,3,5,5,7,8};
	int flag=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==s) {
			flag=1;
		}
	}
	if(flag==1) {
		System.out.println("number is present"+s);
	}
	else {
		throw new ArrayExcep();
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter element");
	int s=sc.nextInt();
	ArrayExcep a=new ArrayExcep();
	try {
		a.search(s);
	} catch (Exception e) {
		System.out.println("this element is not present");
	}
}
}
