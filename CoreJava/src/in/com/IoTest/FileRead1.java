package in.com.IoTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
		int ch=fr.read();
		while (ch!=-1) {
			System.out.print((char)ch);
			ch=fr.read();
			
			
		}
		fr.close();
	}

}
