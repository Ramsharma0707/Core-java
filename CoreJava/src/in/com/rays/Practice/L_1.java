package in.com.rays.Practice;

public class L_1 {
public static void main(String[]args) {
	//print 1 to 5
//	for( int i=1;i<=5;i++) {
//	System.out.println(""+i);
	
//	
//	for(int i=1;i<=5;i++) {
//		System.out.println(""+i);
//	}
//		for(int j=1;j<=8;j++) {
//	System.out.println(""+j);		
	
//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=5;j++) {
//		System.out.println(" " +j);
//	}

//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
	int term=5;
	for(int i=1;i<=term;i++) {
		for(int j=term;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}

