package in.com.comparatorsort;

public class Employ {
	 int emid;
	 String name;
	 String phone;
	
	public Employ(int emid, String name, String phone) {
		super();
		this.emid = emid;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " emid=" + emid + ", name=" + name + ", phone=" + phone + "";
	}
	
 
}
