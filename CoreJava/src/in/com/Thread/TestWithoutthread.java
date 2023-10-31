package in.com.Thread;

public class TestWithoutthread {
public static void main(String[] args) {
	WithoutYThread w=new WithoutYThread("Hit");
	WithoutYThread w1=new WithoutYThread("Man");
	w.run();
	w1.run();
	
}
}



