package in.com.IoTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ByLine {
public static void main(String[] args) throws IOException {
	FileReader fr= new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
	BufferedReader br= new BufferedReader(fr);// line by line
	String s=br.readLine();//puri line
	while(s!=null) {
		System.out.println(s);
		s=br.readLine();
		
	}
	fr.close();
}
}
