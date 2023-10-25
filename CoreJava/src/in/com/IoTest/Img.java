package in.com.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Img {
public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\v1.jpg");
	FileOutputStream out=new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\copy.jpg");
	int ch=in.read();
	while(ch!=-1) {
		out.write(ch);// jo vha se aa rha use yha write krva rhe
		ch=in.read();
	}
	System.out.println("done");
	in.close();
	out.close();
}
}
