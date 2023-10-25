package in.com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) throws Exception {
	FileInputStream in =new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\byte.txt");
	ObjectInputStream oi=new ObjectInputStream(in);
	MarkSheet s= (MarkSheet) oi.readObject();
	System.out.println("id="+s.id);
	System.out.println("name="+s.name);
	System.out.println("java="+s.java);
	System.out.println("python="+s.python);
	System.out.println("UI ="+s.ui);
	
}
}
