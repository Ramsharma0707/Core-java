package CollectionsFram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSort_m {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(60);
		marks.add(40);
		marks.add(80);
		marks.add(33);
		
		System.out.println(marks);
		
		Collections.sort(marks);//same type value sort krega
		System.out.println(marks);
		
	}

}
