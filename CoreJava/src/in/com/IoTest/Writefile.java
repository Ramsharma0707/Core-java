package in.com.IoTest;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
public static void main(String[] args) throws IOException {
	FileWriter fr= new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\rgg.txt");
	fr.write("this text for write file in text ekgfjwgef ewkjbfgkjwef ");
	fr.close();
	System.out.println("done");
}
}
