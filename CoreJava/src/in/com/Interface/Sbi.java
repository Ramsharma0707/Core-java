package in.com.Interface;

public class Sbi implements Bank {
 double ssi,fsi,d=0;
	public void SavingRate() {
	 double ssi;
	 double p=1000;  double r=3;double t=3.5;
	 ssi=(p*r*t)/100;
		System.out.println("Intrest on saving acc " +ssi);
	}

	@Override
	public void Fdintrestrate() {
		 double fsi;
		 double p=1000;  double r=7.5;double t=3.5;
		 fsi=(p*r*t)/100;
			System.out.println("Intrest on saving acc " +fsi);
		
	}

	@Override
	public void a() {
	System.out.println(fsi+" "+ssi);
      
		d=fsi-ssi;
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		Sbi sb=new Sbi();
		sb.Fdintrestrate();//call method
		sb.SavingRate();// call method
		sb.a();
		
		
		
		
	}


	
}
