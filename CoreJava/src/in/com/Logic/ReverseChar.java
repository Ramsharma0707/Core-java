package in.com.Logic;

import java.util.Arrays;

public class ReverseChar {
public static void main(String[] args) {
	String name="rahul";
	char ch[]=name.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
		char tmp=ch[i];
		ch[i]=ch[ch.length-1-i];
		ch[ch.length-1-i]=tmp;
	}
	name=Arrays.toString(ch);
	System.out.println(name);
	
	}
	
	}

