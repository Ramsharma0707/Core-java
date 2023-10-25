package in.com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestClass {
public static void main(String[] args) throws IOException {
	FileOutputStream in= new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\byte.txt");
	ObjectOutputStream out=new ObjectOutputStream(in);
	
	MarkSheet m= new MarkSheet();
	m.id=101;
	m.name="Raaa";
	m.java=87;
	m.python=70;
	m.ui=78;
	m.total=m.java+m.python+m.ui;
	out.writeObject(m);
	in.close();
	out.close();
	System.out.println("object converted to bytestream");
}
}
