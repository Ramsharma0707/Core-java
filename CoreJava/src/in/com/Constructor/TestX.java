package in.com.Constructor;

public class TestX {
public static void main(String[] args) {
	X r=new X();//r is refernce varible // call default construtor
	System.out.println(r.a+" " +r.b+ " " +r.c);
	
	
	X r1=new X(1000);// call one parameter 
	System.out.println(r1.a);
	
	
	X r2=new X(99.99, "indore");
	System.out.println(r2.b+" "+r2.c);
	
}
}
