package in.com.IOTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readbyline {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\fil.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		System.out.println("done");
		fr.close();
		br.close();
	}

}
