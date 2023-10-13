package MAPNQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueMethod {
public static void main(String[] args) {
	Queue <Integer> num=new PriorityQueue<Integer>(Comparator.reverseOrder());
	num.add(100);
	num.add(201);
	num.add(80);
	num.add(900);
	num.element();
	System.out.println(num);
	System.out.println(num.element());
	System.out.println("______________");
	System.out.println(num.peek());
	System.out.println(num.poll());
	System.out.println(num);
	System.out.println("____________");
	num.remove();
	System.out.println(num);
	
}
}
