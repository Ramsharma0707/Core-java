package in.co.rays.data;

public class Cust implements Cloneable{
	String name;
	Acc a=new Acc();
	public Cust (String name ,int balance ){
		this.name=name;
		this.a.balance=balance;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	//Cust c=super.clone(); y kyu
	
	Cust c=(Cust) super.clone();//y name k liye
	c.a=(Acc) a.clone();//y bhi balace k liye
	return c;
}

}
