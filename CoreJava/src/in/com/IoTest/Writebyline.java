package in.com.IoTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writebyline {
public static void main(String[] args) throws IOException {
	FileWriter fr=  new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\sagar.txt");
	PrintWriter pw= new PrintWriter(fr);
	pw.println("this is line1");
	pw.println("this is line 2");
	pw.println("this is line 3");
	System.out.println("donennn");
	pw.close();
	fr.close();
}
 
}
