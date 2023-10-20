package in.com.IoTest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Byuserinput {
public static void main(String[] args) throws IOException {
	System.out.println("enter the text");
	InputStreamReader isr=new InputStreamReader(System.in);//
	BufferedReader br=new BufferedReader(isr);
	String s=br.readLine();
	FileWriter fw= new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\Fil.txt");
	PrintWriter pw=new PrintWriter(fw);//next line
	while(!(s.equals("yyy"))) {
		pw.println(s);
		s=br.readLine();
		
	}
	System.out.println("exit");
	isr.close();
	br.close();
	fw.close();
	pw.close();
}
}
