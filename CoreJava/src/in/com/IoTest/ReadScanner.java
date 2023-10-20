package in.com.IoTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadScanner {
	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
		Scanner sc=new Scanner (fr);
		while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
 fr.close();
 sc.close();
}
}