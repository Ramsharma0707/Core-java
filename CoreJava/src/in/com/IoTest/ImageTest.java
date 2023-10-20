package in.com.IoTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageTest {
	public static void main(String[] args) throws IOException {
      FileInputStream in=new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\v1.jpg");
      FileOutputStream out=new FileOutputStream("C:\\Users\\Hp\\Desktop\\rs1.jpg");
      int ch=in.read();
      while(ch!=-1) {
    	  out.write(ch);
    	  ch=in.read();

      }
	  System.out.println("dddd");
      in.close();
      out.close();
	}
}
