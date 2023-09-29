package in.com.basic;

public class PrimeNo {
public static void main(String[]args) {
	int num=13;
	int count=0;
	for(int i=2; i<num;i++) {
		if (num%i==0) {
			count++;
			
		}
	}
	
	if (count==0) {
		
		
		System.out.println("yes this is prime no");
		
	}else {
		
		System.out.println("this is not prime no");
		
		
	}
}
}
    	  
    	  



