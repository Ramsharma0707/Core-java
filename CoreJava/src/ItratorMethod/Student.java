package ItratorMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {
	int id;
	String name;
	int fee;
	
public Student(int id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
}

public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
	Student sm= new Student(202,"Raaj",200);
	Student sm1=new Student(101,"rahul",5000);
	Student sm2=new Student (100,"ELex",8000);
	Student sm3=new Student (400,"sss",4565);
	al.add(sm);
	al.add(sm1);
	al.add(sm2);
	al.add(sm3);
	System.out.println("sort throw id");
	Collections.sort(al, new SortId());
	Iterator<Student> it = al.iterator();
	while (it.hasNext()) {
	Student s=it.next();
	System.out.println(s);
	}
	
	System.out.println("-----sort name-----");
	Collections.sort(al, new SortName());
	Iterator<Student>it1=al.iterator();
	while(it1.hasNext()) {
		Student s=it1.next();
		System.out.println(s);
	}
	
	
}
}

