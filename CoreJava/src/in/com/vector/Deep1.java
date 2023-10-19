package in.com.vector;

public class Deep1 implements Cloneable {
int id=0;

public Deep1(int id) {
	super();
	this.id = id;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
