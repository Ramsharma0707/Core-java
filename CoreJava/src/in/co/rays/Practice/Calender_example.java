package in.co.rays.Practice;

import java.util.Calendar;
import java.util.Date;

public class Calender_example {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DATE,5);
	Date date=cal.getTime();
	System.out.println(date);
}
}
