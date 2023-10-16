package in.com.SetGet_method;

public class Employ {
public static void main(String[] args) {
	Employ_details ed=new Employ_details();
	ed.setId(100);
	ed.setAge(28);
	System.out.println(ed.getId());
	System.out.println(ed.getAge());
}
}
