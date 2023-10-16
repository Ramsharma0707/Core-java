package in.co.exception;

public class Excep3arr {
	public static void main(String[] args) {
		int[]a=new int[5];
	//	a[10]=50;
	//	System.out.println(a);
		try {
			a[10]=50;
				System.out.println(a);
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
