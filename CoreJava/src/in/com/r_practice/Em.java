package in.com.r_practice;

public class Em implements Comparable<Em> {
 private int Emid;
 private String name;
 private String phone;
public Em(int emid, String name, String phone) {
//	super();
	Emid = emid;
	this.name = name;
	this.phone = phone;
   	
}
 @Override
	public int compareTo(Em o) {
		
		return this.Emid-o.Emid;
	}
@Override
public String toString() {
	return "Em Emid=" + Emid + ", name=" + name + ", phone=" + phone + "";
}
 
	}

