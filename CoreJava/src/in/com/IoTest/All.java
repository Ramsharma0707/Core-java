package in.com.IOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class All {
public static void main(String[] args) throws IOException {
	System.out.println("Enter the text");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s=br.readLine();
	FileWriter fw=new FileWriter("C:\\Users\\Hp\\Desktop\\n.txt");
	PrintWriter pw=new PrintWriter(fw);
	while(!(s.equals("RR"))) {
		pw.println(s);// printwriter ki 
		s=br.readLine();
	}
	System.out.println("hmm");
	isr.close();
	br.close();
	fw.close();
	pw.close();

	while(s!=null) {
		
	}
}
}
