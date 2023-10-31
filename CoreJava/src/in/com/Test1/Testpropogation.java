package in.com.Test1;

public class Testpropogation {
	public static void main(String[] args) {
    m1();
		
	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
		try {
			m3();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private static void m3() {
		String name="ram";
		System.out.println(name.charAt(5));
		
	}

}
