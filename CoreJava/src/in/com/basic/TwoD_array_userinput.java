	package in.com.basic;

	import java.util.Scanner;

	public class TwoD_array_userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int number[]=new int [size];
		
		System.out.println("Enter the values");
		for (int i = 0; i < number.length; i++) {
			number[i]=sc.nextInt();
		}
		System.out.println("Search the index");
		int x=sc.nextInt();
		for (int i = 0; i < number.length; i++) {
			if(number[i]==x) {
				System.out.println("index number ="+i);
			}
			else {
				System.out.println("value not match");
				break;
			}
			
		}
		
	}
	
	}
