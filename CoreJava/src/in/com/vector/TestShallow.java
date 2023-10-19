package in.com.vector;

public class TestShallow {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account a1=new Account(101, "Ram");
		Account a2=(Account) a1.clone();
		a2.id=102;
		a2.name="shaaa";
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a2.id);
		System.out.println(a2.name);
	}

}
