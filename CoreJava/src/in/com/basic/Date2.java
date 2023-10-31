package in.com.basic;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class Date2 {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("dd//MM//yyyy");
		String str= "24/10/2023";
		
		
		Date d1=sdf.parse(str);// int to string 
		System.out.println(d1);
	}

}
