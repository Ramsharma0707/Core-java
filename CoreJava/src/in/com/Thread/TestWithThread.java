package in.com.Thread;

public class TestWithThread {
public static void main(String[] args) {
	WithThread w1=new WithThread("java");
	WithThread w2=new WithThread("python");
	w1.setPriority(5);
	w2.setPriority(2);
	w1.start();
	w2.start();
	
}
}
