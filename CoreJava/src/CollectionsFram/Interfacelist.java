package CollectionsFram;

import java.util.LinkedList;

public class Interfacelist {
public static void main(String[] args) {
	LinkedList  l=new LinkedList();
	l.add(105);
	l.add(106);
	l.add(107);
	l.add(115);
	l.add(144);
	System.out.println(l);
	System.out.println("___________________");
	System.out.println(l.getFirst());
	System.out.println(l.get(1));
	System.out.println(l.subList(1,5));
	
}
}
