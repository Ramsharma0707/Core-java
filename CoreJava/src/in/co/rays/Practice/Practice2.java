package in.co.rays.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice2 {
	public static void main(String[] args) throws ParseException {
		String str=("19/09/2023");
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date t=sdf.parse(str);
		System.out.println(t);
		
		
	}
	}

	

