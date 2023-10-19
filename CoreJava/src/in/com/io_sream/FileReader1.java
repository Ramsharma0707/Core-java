package in.com.io_sream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
		int r =fr.read();
		while(r!=-1) {
			System.out.print((char)r);
			r=fr.read();
			
		}
		fr.close();
	}

}
