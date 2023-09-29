package in.co.rays.Practice;

public class NameLength {
	
	public static void main(String[] args) {
		
		String name = "Ram Sharma";
		
	//	System.out.println(name.length());
	//	System.out.println("7th character is " +name.charAt(6));
	//   System.out.println("rma index is " +name.indexOf("rma"));
	//	System.out.println("first S position " +name.indexOf("S"));
	//	System.out.println("last a position " +name.indexOf("a"));
	//	System.out.println("a is replaced by b "+name.replace("a","b"));
		System.out.println("lowercase check " +name.toLowerCase());
		System.out.println("Uppercase check " +name.toUpperCase());
		System.out.println("name starts with Ram " +name.startsWith("Ram"));
	    System.out.println("name ends with rma " +name.endsWith("rma"));
	    System.out.println("substring  "+ name.substring(1));
	
	}
	

}
