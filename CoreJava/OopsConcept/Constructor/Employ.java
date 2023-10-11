package Constructor;

public class Employ {
int id;
int age;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
	Employ e=new Employ();
	e.setId(101);
	e.setAge(24);
	System.out.println(e.getId());
	System.out.println(e.getAge());
}

}
