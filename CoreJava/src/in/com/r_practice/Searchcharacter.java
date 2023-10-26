package in.com.r_practice;

import java.util.Scanner;

public class Searchcharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	String str="this text for check character present or not";
	System.out.println("Search the character");
	char s=sc.next().charAt(0);
	int flage=0;
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		//for (int j = 0; j < ch.length; j++) {
			if(ch[i]==s) {
				flage=1;
			}
		}
		if(flage==1) {
			System.out.println("character present");
		}
		else {
			System.out.println("not present");
	}
}
}
