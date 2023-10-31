package in.com.Thread;

public class TestRunnable {
public static void main(String[] args) {
	Thread t1=new Thread(new ByRunnable("core"));
	Thread t2 =new Thread(new ByRunnable("SSS"));
	t1.setPriority(8);
	t2.setPriority(2);
	//t1.start();
	//t2.start();
	t1.run();
	t2.run();
}
}
