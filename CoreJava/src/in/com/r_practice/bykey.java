package in.com.r_practice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class bykey {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter text");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		FileWriter fw=new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\byu.txt");
		PrintWriter pw=new PrintWriter(fw);
		while (!(s.equals("dd"))) {
			pw.write(s);
			s=br.readLine();
			
		}
		System.out.println("exit");
		isr.close();
		br.close();
		fw.close();
		pw.close();
		
	}

}
