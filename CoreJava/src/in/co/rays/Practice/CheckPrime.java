package in.co.rays.Practice;

public class CheckPrime {
public static void main(String[]args) {		
//	int num=12;
//	int count=0;
//	for(int i=2;i<num;i++) {
//		if(num%i==0) {
//			count++;	
//		}
//	}
//		if (count==0) {
//			System.out.println("This is prime no");
//		}else {
//			System.out.println("This is not a prime no");
//		}
		
	int number =11;
	int count =0;
	for(int i=2; i<=number;i++) {
		if(number%2==0) {
			count++;
		}
		}
	if(count==0) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Number is not prime");
	}
	}
}
	
	

