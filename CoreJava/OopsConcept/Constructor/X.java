package Constructor;

public class X {
	int a; double b; String c;
	// Constructor name same as class name
	public X() {// default constructor
		a=100; b=99.78; c="RAys";
	}
	public  X(int x) {//one parameterize constructor
		a=x;
		
	}
	public X(double y, String z) {// two paramerize cpnstructor
		b=y;
		c=z;
	}

}
