package in.com.rays.Practice;

public class B_ffer {
	public static void main(String[] args) {
		StringBuffer rs= new StringBuffer("Vijay" );
		rs.append(" Dinanath chauhan");
		
		System.out.println(rs);
		System.out.println("Length :"+ rs.length());
		System.out.println(rs.capacity());
		System.out.println(rs.charAt(3));
		System.out.println(rs.indexOf("na"));
	//	System.out.println(rs.replace(1, 2, "ram"));
		System.out.println(rs.reverse());
		
	}

}
