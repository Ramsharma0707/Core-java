package in.co.rays.Practice;

public class IfElse {
	
	public static void main(String[]args) {
//		int a=120;
//		if (a>100) {
//		System.out.println(" number is gratter than a value");
//	}
//	else {
//			System.out.println("Number is smaller then the value ");
//		}
int num1=1100;
int num2=1150;
int num3=200;
int max;
if(num1>num2) {
	max=num1;
	if (num1>num3) {
		max=num1;
		System.out.println("num1 is grater "+max );
	}}
	if(num2>num3) {
		max=num2;
	if(num2>num1) {
		max=num2;
		System.out.println("num2 is grater "+max);
	}}
	if(num3>num1) {
		max=num3;
	if(num3>num2) {
		max=num3;
		System.out.println("num3 is grater "+max);
	}}
	}
	}

