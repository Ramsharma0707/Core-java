package in.com.Logic;

public class Panlind {
	public static void main(String[] args) {

		int num;
		
		for (int i = 100; i < 10000; i++) {
			
		int sum=0;
		num=i;
		while(num>0) {
		int	rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(i==sum) {
			System.out.println(" "+i);
		}
		
	}

	}}
