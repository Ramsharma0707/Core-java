package in.com.io_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTestScanner {
public static void main(String[] args) throws IOException {
	FileReader file=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
  Scanner sc=new Scanner(file);
  while(sc.hasNext()) {
	  System.out.println(sc.nextLine());
  }
  sc.close();
  System.out.println("donnne");
}
}
