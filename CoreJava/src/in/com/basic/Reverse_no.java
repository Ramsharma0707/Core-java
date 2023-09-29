package in.com.basic;

public class Reverse_no {
public static void main(String[] args) {
//	int number=98745;
//	int reverse=0;
//	for(;number!=0;) {
	//while(number!=0) {
//		int reminder=number%10;//last digit ans m deta hai
//		reverse=reverse*10+reminder;
		//reverse=reverse+reminder;	
//		number=number/10;//last digit htane ka kaam
//	}
//	System.out.println("Reverse no is=" +reverse);
//}
//}
int number=789456;
int reverse=0;
while(number!=0) {
	int reminder=number%10;
	reverse=reverse*10+reminder;
	number=number/10;
}
System.out.println(reverse);


}}