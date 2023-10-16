package in.com.rays.data;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cust c=new Cust("ram",888);
		
		//Cust c2=c;  y kyu krte h
		Cust c2=(Cust) c.clone();
		c2.name= "ggg";
		c2.a.balance=44;
		System.out.println(c.name);
		System.out.println(c.a.balance);
		System.out.println(c2.name);
		System.out.println(c2.a.balance);
		
		
	
}
}