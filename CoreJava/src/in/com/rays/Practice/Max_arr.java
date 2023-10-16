package in.com.rays.Practice;

public class Max_arr {
public static void main(String[] args) {
	int []arr= {1,2,3,55,5,7,};
	int max=0;
	for (int i = 0; i > arr.length; i++) {
		if(i<max) {
			max=i;
		}
		System.out.println(max);
	}
	
}
}
