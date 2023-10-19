package in.com.vector;

public class TestDeep {
	public static void main(String[] args) throws CloneNotSupportedException {
		Deep12 d1=new Deep12("Ram", 500, 101);
		Deep12 D2=(Deep12) d1.clone();
		D2.name="hhhhh";
		D2.balance=700;
		D2.d.id=102;
		System.out.println(d1.name);
		System.out.println(d1.balance);
		System.out.println(d1.d.id);
		System.out.println(D2.name);
		System.out.println(D2.balance);
		System.out.println(D2.d.id);
	}

}
