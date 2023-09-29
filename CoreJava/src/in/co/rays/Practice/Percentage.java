package in.co.rays.Practice;

public class Percentage {
	public static void main(String []args) {
		int sub1=80;
		int sub2=95;
		int sub3=90;
		int sub4=50;
		int sub5=70;
		double Totalnumber =sub1+sub2+sub3+sub4+sub5;
		double ave=(Totalnumber/5);
		double percent=(Totalnumber/500)*100;
		System.out.println("Total number="+Totalnumber);
		System.out.println("average of all sub "+ave);
		System.out.println(" total percentage is "+percent);
	}

}
