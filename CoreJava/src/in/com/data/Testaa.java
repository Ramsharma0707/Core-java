package in.com.data;



public class Testaa  {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	

	Account_cl c1=new Account_cl(500,"Ram");
	Account_cl c2=(Account_cl) c1.clone();
	c2.balance=8765;
	c2.name="rass";
	System.out.println(c1.balance);
	System.out.println(c1.name);
	System.out.println(c2.balance);
	System.out.println(c2.name);
	}
}
