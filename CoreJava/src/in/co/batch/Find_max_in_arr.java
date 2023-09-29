package in.co.batch;

public class Find_max_in_arr {
public static void main(String[] args) {
	int arr[]= {20,40,5,80,30,};
	int max=arr [0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
	}
	System.out.println(max);
}
}
