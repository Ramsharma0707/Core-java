package in.com.MapnQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueMethod {
public static void main(String[] args) {
	Queue <Integer> num=new PriorityQueue<Integer>((Comparator.reverseOrder()));//comparator.reverse nahi lgayege to choti-se bdi value print krga
	num.add(100);
	num.add(201);
	num.add(80);
	num.add(900);
	num.element();
	System.out.println(num);
	
	num.offer(1000);//offer value update add kr deta h shi index pr 
	System.out.println(num);
	
	System.out.println("_____");
	System.out.println(num.element());//retrive aesa ka aesa jese add kiye unhe print kr dega
	System.out.println("______________....");
	System.out.println(num.peek());//head value dega pr use hatayega nahi
	System.out.println(num);
	System.out.println(num.poll());//head value dega bhi or use hata bhi dega
	System.out.println(num);
	System.out.println("____________");
	num.remove();
	System.out.println(num);// head value hta k baki print
	
}
}
