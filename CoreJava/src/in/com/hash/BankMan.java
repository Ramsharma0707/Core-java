package in.com.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class BankMan  {
public static void main(String[] args) {
	HashSet<Bankers> b=new HashSet <Bankers>();
	Bankers a=new Bankers(101, 91318648, "lavish", "bhind");
	Bankers c=new Bankers(102, 913148, "Ram", "Murena");
	Bankers d=new Bankers(103, 918648, "Rahu", "Indore");
	Bankers e=new Bankers(104, 9318648, "Ketu", "Ujjain");
	b.add(a);
	b.add(c);
	b.add(d);
	b.add(e);
	System.out.println(b);
	
	TreeSet <Bankers> tr=new TreeSet<>();
	System.out.println(tr);
	Iterator<Bankers> it= b.iterator();
	while (it.hasNext()){
		Bankers ba= (Bankers)it.next();
		System.out.println(ba);
	}
	
}


}

