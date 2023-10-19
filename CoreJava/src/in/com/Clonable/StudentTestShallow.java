package in.com.Clonable;

public class StudentTestShallow {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentShallow s1=new StudentShallow(1, "raju", (float) 800.54);
		StudentShallow s2=(StudentShallow) s1.clone();
		s2.id=2;
		s2.name="maiti";
		s2.Expense=(float)700.87;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.Expense);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.Expense);
	}

}
