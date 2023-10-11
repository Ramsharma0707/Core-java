package Exceptionnnnn;

public class TestPropogation {
public static void main(String[] args) {
	m1();

}
	public static void m1() {
		m2();
	}
	public static void m2() {
		try {
			m3();
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	public static void m3() {
		String name="Ramm";
		System.out.println(name.charAt(15));
	}
}
