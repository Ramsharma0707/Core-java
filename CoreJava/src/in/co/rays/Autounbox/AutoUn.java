package in.co.rays.Autounbox;

public class AutoUn {
	public static void main(String[] args) {
		int a=10;
		Integer b= new Integer(a);// autoboxing -primitive to wrapper class
		System.out.println(a);
		System.out.println(b);
		
		Integer c=new Integer(20);
		int d=c;
		System.out.println(c);
		System.out.println(d);
		
	}

}
