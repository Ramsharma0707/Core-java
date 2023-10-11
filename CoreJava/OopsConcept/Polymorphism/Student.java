package Polymorphism;

public class Student {
public void read() {
	System.out.println("student reading book");
	
}
public void read(String bookname) {
	System.out.println("bookname "+bookname);
	
}
public void read(String writer,int price) {
	System.out.println(writer);
	System.out.println(price);
}
}
