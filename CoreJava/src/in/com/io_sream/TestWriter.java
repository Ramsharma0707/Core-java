package in.com.io_sream;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\Write.txt");
	fw.write("this text for write ");
	fw.close();
	System.out.println("data write done");
}
}
