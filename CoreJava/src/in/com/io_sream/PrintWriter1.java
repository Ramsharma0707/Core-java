package in.com.io_sream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
public static void main(String[] args) throws IOException {
	FileWriter file= new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\r.txt");
	PrintWriter out= new PrintWriter(file);
	out.println("this is for writing the text in next line ");
	out.println("this next in next line");
	System.out.println("done");
	file.close();
	out.close();
}
}
