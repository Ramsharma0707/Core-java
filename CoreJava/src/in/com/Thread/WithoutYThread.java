package in.com.Thread;

public class WithoutYThread {
	String name =null;
	public WithoutYThread(String name) {
	this.name=name;	
	}
	
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println(name+ " "+ i);
			
		}

	}

}
