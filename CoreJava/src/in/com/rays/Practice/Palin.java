package in.com.rays.Practice;

	public class Palin {
		public static void main(String[] args) {
			
		
		int num=151;
		int sum=0;
		int temp=num;
		int remin;
		while(temp>0) {
			remin=temp%10;
			sum= sum*10+remin;
			temp=temp/10;
			
		}
		if (num==sum) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not palindrom");
		}
}
}