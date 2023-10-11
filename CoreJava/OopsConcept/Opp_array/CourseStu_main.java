package Opp_array;

import java.util.Scanner;

public class CourseStu_main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Student []s =new Student[2];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter s id");
			int s_id=sc.nextInt();
			System.out.println("enter name");
			String s_name=sc.next();
			System.out.println("enter your course name");
		    String c_name=sc.next();
			System.out.println("Enter fee");
			int c_fees=sc.nextInt();
			Course c=new Course(c_name, c_fees);
			s[i] =new Student(s_id, s_name, c, false);
		}
		for (int i = 0; i < s.length; i++) {
		if(s[i].c.c_fees>1500) {
			s[i].isSpecial=true;
			System.out.println("you r special");
		}else {
			System.out.println("not special");
		}
		}
		
	}

}
