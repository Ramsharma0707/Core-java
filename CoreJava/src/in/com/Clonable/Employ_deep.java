package in.com.Clonable;

public class Employ_deep implements Cloneable {
int id;

public Employ_deep() {//constructor 
	
	
}
 
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}
