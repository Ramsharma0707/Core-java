package in.com.rays.Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice {
public static void main(String[] args) {
Date today=new Date();
System.out.println(today);
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
String str=sdf.format(today);
System.out.println(str);

}
}
