package in.com.TestOpps;

public class PolyOverloadingCompany{
	
	public void Com() {
		System.out.println(" company xyz");
	}
	public void Com(String name) {
		System.out.println("Name"+ "  "+name);
		
	}
	public void Com(int Turnover, String name) {
		System.out.println("TurnOver"+"  "+Turnover+"   " +"Name"+"  "+name);
	}

}
