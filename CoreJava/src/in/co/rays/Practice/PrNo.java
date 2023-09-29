package in.co.rays.Practice;

public class PrNo {
	public static void main(String[]args) {
		int num=20;
		int count=0;
		for(int i=2; i<=num;i++) {
			if(num%2==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
	}
	}

}
