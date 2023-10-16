package in.com.rays.Practice;

public class Rs_1_buffer {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer("Ram") ;
sb.append("Sharma rohit");
System.out.println("length :" +sb.length());
System.out.println("Capacity :" +sb.capacity());
System.out.println("Char at :" +sb.charAt(0));
System.out.println("index of :" +sb.indexOf("rohit"));
System.out.println("rplace :" +sb.replace(0,5,"ram"));
System.out.println("Reverse :" +sb.reverse());


}
}

