package in.com.rays.Practice;

public class Check_name_string {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chauhan";
		System.out.println(name.length());
		System.out.println(name.charAt(8));
		System.out.println(name.indexOf("Dina"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace("a", "i"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("an"));
		System.out.println(name.substring(6));
	}

}
