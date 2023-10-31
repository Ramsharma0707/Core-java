package in.com.Practice_opps;

class Shape{
 public	int BW=100;
 public String Color="red";
}

class Rect extends Shape{
public 	int BW1=40;
public 	String Color1="blue";
}



public class Single {
public static void main(String[] args) {
	Rect r=new Rect();
	System.out.println(r.BW);
	System.out.println(r.BW1);
	System.out.println(r.Color);
	System.out.println(r.Color1);
	
	Shape s=new Shape();
	System.out.println(s.BW);
	System.out.println(s.Color);
	
}
}
