package SetGet_method;

public class Testcons {
public static void main(String[] args) {
	Cons r=new Cons();
	System.out.println(r.a+ "   " +r.b+ "  " +r.c );
	Cons r1=new Cons(1000);
	Cons r2=new Cons(85.50,"raaaaa");
	//System.out.println(r.a+ "   " +r.b+ "  " +r.c );
	System.out.println(r1.a);
	System.out.println(r2.b+"   "+r2.c);
}
}
