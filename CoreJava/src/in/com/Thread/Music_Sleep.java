package in.com.Thread;


public class Music_Sleep extends Thread {

	public void run() {

		for (int i = 0; i < 3; i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s+ ""+"+music play");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
public static void main(String[] args) {
	Music_Sleep s=new Music_Sleep();
	s.setName("Pop music");
	s.start();
	Music_Sleep s1 =new Music_Sleep();
	s.setName("Classical");
	s1.start();
}
}
