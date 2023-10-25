package in.com.io_stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import in.com.rays.Practice.WhileLoop;

public class Bykeyword {
public static void main(String[] args) throws IOException {
	System.out.println("Enter text");
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	String Line=br.readLine();
	FileWriter Write=new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\byuserinput.txt");
	PrintWriter pw=new PrintWriter(Write);
//	String Line=br.readLine();
	while(!(Line.equals("Stop"))){
	pw.println(Line);
	Line=br.readLine();
	}
	System.out.println("ddone");
	isr.close();
	br.close();
	Write.close();
	pw.close();
}
}
