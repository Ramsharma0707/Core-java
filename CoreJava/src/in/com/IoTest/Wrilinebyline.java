package in.com.IOTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Wrilinebyline {
	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\liee.txt");
		PrintWriter pw=new PrintWriter(fw);//line by line
		pw.println("hiiiiiii");//give text
		pw.println("wgjgjfgwjgef");
		System.out.println("d");
		fw.close();
		pw.close();
	}

}
