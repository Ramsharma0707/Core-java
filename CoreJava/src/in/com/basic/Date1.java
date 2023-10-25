package in.com.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
public static void main(String[] args) throws ParseException {
	Date date=new Date();
	System.out.println(date);//tue oct 24 time ist2023
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd//MM//yyy");
	String str =sdf.format(date);// string to int --format method
	System.out.println(str);

}
}
