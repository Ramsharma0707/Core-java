package in.com.basic;

public class Arms {
public static void main(String[] args) {
int num=3471;
int b=0;
int c;
int d=num;
while(d>0) {
	c=d%10;
	b=b+(c*c*c);
	d=d/10;
}
if(b==num) {
	System.out.println("number is armastrong");
}
else {
	System.out.println("Not armstrong");
}

}}

