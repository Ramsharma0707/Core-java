package in.com.io_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
	BufferedReader b=new BufferedReader(fr);
	String s=b.readLine();
	while(s!=null) {
		System.out.println(s);
		s=b.readLine();
		
	}
	fr.close();
	b.close();
}
}
