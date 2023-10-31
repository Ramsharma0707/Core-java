package in.com.Test1;

public class Pra1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		//int c=a/b;
		//System.out.println(c);
		try {
			int c=a/b;
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		String name="ddd";
	//	System.out.println(name.charAt(5));
		try {
			System.out.println(name.charAt(5));
		} 
		catch ( Exception e) {
			System.out.println(e);
		}
	}

}
