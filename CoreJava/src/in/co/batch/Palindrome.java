package in.co.batch;

 public class Palindrome {
//	public static void main(String[] args) {
//		
//	
//	int a=151;
//	int b=a;
//	int c=0;
//	int d;
//	while(b>0) {
//		d=b%10; // last term m 1%10=1
//		c=c*10+d;
//		b=b/10; // last term 1/10=0
//		
//	}
//	if(a==c) {
//		System.out.println("Palindrome");
//	}
//	else {
//		System.out.println("not palindrom");
//	}
		
//		package in.co.rays.Practice;

	//	public class Palin {
			public static void main(String[] args) {
				
			
			int num=151;
			int sum=0;
			int temp=num;
			int remin;
			while(temp>0) {
				remin=temp%10;
				sum= sum*10+remin;
				temp=temp/10;
				
			}
			if (num==sum) {
				System.out.println("palindrom");
				
			}
			else {
				System.out.println("not palindrom");
			}
	}
	
		
		
		
	}
