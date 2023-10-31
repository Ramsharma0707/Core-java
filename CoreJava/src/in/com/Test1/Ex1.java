package in.com.Test1;

public class Ex1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		//int c=a/b;
		
		try {
			int c=a/b;
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		String name="Ram";
	//	System.out.println(name.charAt(8));
		try {
			System.out.println(name.charAt(8));	
		} catch (Exception e) {
			System.out.println(e);
		//	e.printStackTrace();
		}
		finally {
			System.out.println("code ended");
		}
		
	}
}
