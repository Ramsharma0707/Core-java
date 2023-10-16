package in.co.rays.collectionframe;

import java.util.LinkedList;

public class Interfacelist {
public static void main(String[] args) {
	LinkedList  l=new LinkedList();//page 10 
	l.add(105);
	l.add(106);
	l.add(107);
	l.add(115);
	l.add(144);
	System.out.println(l);
	System.out.println("___________________");
	System.out.println(l.getFirst());
	System.out.println(l.get(1));
	System.out.println(l.subList(1,5));//index 1 or 5 tak jo element h wo
	//System.out.println(l.remove());
	System.out.println("____________");
	System.out.println(l.set(2, 0));// jo value yha dali use 0 index vali se change
	System.out.println(l.indexOf(115));//search karega value se or index value dega
	//index of me jo nahi h element wo dala to -1 dega
	System.out.println(l.lastIndexOf(115));// end se search krega pr value index ki dega
	
	
}
}
