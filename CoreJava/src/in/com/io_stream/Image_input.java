package in.com.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image_input {
public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\v1.jpg");
	FileOutputStream out=new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\v2.jpg");
	int ch=in.read();
	while(ch!=-1) {
		out.write(ch);
		ch=in.read();
	}
	in.close();
	out.close();
	System.out.println("image done");
}
}
