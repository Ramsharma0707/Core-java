package in.com.Practice_opps;
/*Method oveloading same class ,same Method, different parameter also call
 * Compile Time and Static binding(Early binding)    */
public class Studen_overloading {
	public void read() {
		System.out.println("Read book");
	}
	public void read(String Bookname) {
		System.out.println("Bookname "+"="+Bookname);
		
	}
	public void read(int price,String Writer) {
		System.out.println("Price"+"="+price);
		System.out.println("Writer "+""+Writer);
		
	}
}
