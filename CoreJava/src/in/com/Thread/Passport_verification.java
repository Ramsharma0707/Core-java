package in.com.Thread;

class Passport implements Runnable{
	Thread t;
	public Passport() throws InterruptedException {
		t=new Thread(this,"Passport");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("plz verify your document......");
		
	}
}
 class Check implements Runnable{
	 Thread t;
	 String name;
	 String location;
	 int phoneno;
	 int Aadhar;
	public Check(String name, String location, int phoneno, int aadhar) throws InterruptedException {
		super();
		this.name = name;
		this.location = location;
		this.phoneno = phoneno;
		Aadhar = aadhar;
		t=new Thread(this,"Check");
		t.start();
		t.join();
		
		
	}
	public void run() {
		System.out.println("please wait verify document ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		 e.printStackTrace();
		}
		System.out.println(name+" "+"name is......"+name);
		System.out.println(name+ "location is........"+location);
		System.out.println(name+"phone no is...."+phoneno);
		System.out.println(Aadhar+"Aadhar no is ..."+Aadhar);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("your document is verified...");
	}
	 
 }
 class Done implements Runnable{
	 Thread t;
	 public Done() throws InterruptedException {
		 t=new Thread(this, "Done");
		 t.start();
		 t.join();
	 }
	@Override
	public void run() {
		System.out.println("document verification is done");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("your passport verification is done");
		
	}
 }
 
 
public class Passport_verification {
public static void main(String[] args) throws InterruptedException {
	Passport p=new Passport();
	Check c=new Check("Raa", "pin-453551", 789456123, 349844305);
	Done d=new Done();
}
}
