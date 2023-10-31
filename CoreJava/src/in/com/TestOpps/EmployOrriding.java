package in.com.TestOpps;

	class Employ{
		public void Showdetails() {
			System.out.println("I am employ of xyz");
		}
		
	}
 class Devloper extends Employ{
	 public void Showdetails() {
		 int a=10;
		 int b=85;
		 int c=a+b;
		 System.out.println(c);
		 System.out.println("i am developer");
	 }
 }


public class EmployOrriding {
	public static void main(String[] args) {
		Employ e=new Devloper();
		e.Showdetails();
	//	Employ e1= new Employ();
	//	e1.Showdetails();
	//	Devloper d=(Devloper) new Employ();
	//	d.Showdetails();
		
	}

}
