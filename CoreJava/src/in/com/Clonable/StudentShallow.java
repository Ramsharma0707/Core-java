package in.com.Clonable;

public class StudentShallow implements Cloneable {
 int id;
 String name;
 float Expense;
public StudentShallow(int id, String name, float expense) {
	super();
	this.id = id;
	this.name = name;
	Expense = expense;
}
 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
