package in.com.r_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Img {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\v1.jpg");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Hp\\Desktop\\v2.jpg");
	int ch=fis.read();
	while(ch!=-1) {
		fos.write(ch);
		ch=fis.read();
	}
	System.out.println("done");
	fis.close();
	fos.close();
} 
}
