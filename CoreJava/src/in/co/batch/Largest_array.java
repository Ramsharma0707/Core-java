package in.co.batch;

public class Largest_array {
public static void main(String[] args) {
	int[]arr= {1,52,85,850,66,};
	int a=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>a) {
			a=arr[i];
		}
	}
	System.out.println(a);
}
}
