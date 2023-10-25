package in.com.r_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class S1test {
	public static void main(String[] args) throws IOException {

		
		FileOutputStream in= new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\File.txt");
		ObjectOutputStream out= new ObjectOutputStream(in);
		S1 s=new S1();
		s.java=70;
		s.ui=80;
		s.total=(s.java+s.ui);
		out.writeObject(s);
		System.out.println("done ");
	}

}
