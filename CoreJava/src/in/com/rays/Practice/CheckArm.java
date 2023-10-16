package in.com.rays.Practice;

public class CheckArm {
public static void main(String[] args) {
	int a=153;
	int b=0;
	int c;
	int d=a;
	while(d>0) {
		c=d%10;
		b=b+(c*c*c);
		d=d/10;
				}
	if(b==a) {
		System.out.println("number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}
}
}
