package in.com.Exception;

public class Testpr {
public static void main(String[] args) {
	m1();
}

private static void m1() {
	m2();
	
}

private static void m2() {
try {
	m3();
}
catch (Exception e) {
	System.out.println(e);
}
	
}
public static void m3() {
	String name="kgjff";
	System.out.println(name.charAt(9));
}
}
