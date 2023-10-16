package in.com.rays.hash;

public class Bankers implements Comparable<Bankers> {
	int id;
	int Mobno;
	String name;
	String Location;
	public Bankers(int id, int mobno, String name, String location) {
		super();
		this.id = id;
		Mobno = mobno;
		this.name = name;
		Location = location;
	}
	@Override
	public String toString() {
		return "Bankers id=" + id + ", Mobno=" + Mobno + ", name=" + name + ", Location=" + Location + " ";
	}
	@Override
	public int compareTo(Bankers o) {
		if(this.id<o.id) 
			return 1;
			else if(this.id>o.id) 
				return -1;
				return 0;
			}
		

	}
	
