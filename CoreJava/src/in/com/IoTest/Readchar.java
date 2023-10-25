package in.com.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readchar {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
	int ch =fr.read();
	while (ch!=-1) {
		System.out.print((char)ch);
		ch=fr.read();
	}
	System.out.println("done");
	fr.close();
}
}
