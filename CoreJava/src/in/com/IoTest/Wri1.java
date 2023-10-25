package in.com.IOTest;

import java.io.FileWriter;
import java.io.IOException;

public class Wri1 {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\jj.txt");
	fw.write("this dddd text you can enter in single line ");//command write
	System.out.println("d");
	fw.close();
	
}
}
