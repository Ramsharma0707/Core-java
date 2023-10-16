package in.com.Method;

public class TestPen {
public static void main(String[] args) {
	Pen p=new Pen();// object banaya memory allocate ki
	
	
	p.Color="green";//initialize
	p.type="gel";//
	p.price=20;//
	
	p.PrintColor();// call kiya
	p.Printtype();//call
	p.PrintPrice();//call
	
	Pen p1=new Pen();// object aese hi or bhi object bna skte h
	p1.Color="blue";//or 
	p1.type="ball";
	p1.price=10;
	
	
	p1.PrintColor();// object ko call
	p1.Printtype();
	p1.PrintPrice();
	
	
	
}
}
