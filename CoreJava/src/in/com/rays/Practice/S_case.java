package in.com.rays.Practice;

public class S_case {
	public static void main(String[] args) {
		int dayofweek=4;
		switch(dayofweek) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("This value is invalid");
			break;	
		}
	}

}
