package in.com.rays.Practice;

public class ArmStrong {
	
	public static void main(String[]args) {
		
		int a=153;
		int b=0;
		int c;
		int d=a;
		
		while(d>0) {
			
			c=d%10;
			b=b+(c*c*c);
			d=d/10;
			
			
		}
		
		if (b==a) {
			System.out.println("yes this number is armstrong");
			
		}else {
			System.out.println("no this no in not armstrong");
		}
		
	}

}
