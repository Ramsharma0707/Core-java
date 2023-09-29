package in.co.rays.Practice;

public class Testpen {
	public static void main(String[] args) {
		Pen p= new Pen();
		p.Color="Green";
		p.Price=10;
		p.type="gel";
		
		
		p.PrintColor();
		p.PrintPrice();
		p.Printtype();
		
		Pen p1=new Pen();
		p1.Color="red";
		p1.Price=10;
		p1.type="dot";
		
		p1.PrintColor();
		p1.PrintPrice();
		p1.Printtype();
		
	}

}
