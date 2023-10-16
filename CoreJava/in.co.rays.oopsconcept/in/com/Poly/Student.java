package in.com.Poly;

public class Student {
	public void read() {// example compile time =overloading
		System.out.println("Student reading book");
	}
	public void read (String bookname) {
		System.out.println(""+bookname);
	}
	public void read (String writer,int rate) {
		System.out.println(writer);
		System.out.println(rate);
	}
	public void read (int totalb, double avesale) {
		System.out.println(+totalb);
		System.out.println(+avesale);
	

}}