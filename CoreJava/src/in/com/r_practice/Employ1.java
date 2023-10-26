package in.com.r_practice;

public class Employ1 implements Comparable<Employ1> {
	int id;
	String name;
	public Employ1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "  id=" + id + " name=" + name + " ";
	}
	@Override
	public int compareTo(Employ1 o) {
		
		return this.id-o.id;
	}

}
