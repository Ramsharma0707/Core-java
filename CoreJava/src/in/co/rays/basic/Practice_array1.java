package in.co.rays.basic;

public class Practice_array1 {
public static void main(String[] args) {
//	int arr [] = new int[5];
//	arr[0]=101;
//	arr[1]=202;
//	arr[2]=303;
//	arr[3]=400;
//	arr[4]=500;
 int	arr[]= {101,202,205,501,5501,400};
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==1)
		System.out.println(arr[i]);
	}
}
}
