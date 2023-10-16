package in.co.rays.basic;

public class S_switch1opera {
	public static void main(String[] args) {
		int num1=11;
		int num2=10;
		int result;
		char operation []= {'+','-','*'};
		for (int i = 0; i < operation.length; i++) {
		switch (operation[i]) {
		case '+':
			result=num1+num2;
			System.out.println("addition of num= "+result);
			break;
		case'-':
			result=num1-num2;
			System.out.println("Subtration of no= "+result);
			break;
		case'*':
			result=num1*num2;
			System.out.println("Multiploication of this ="+result);
			break;
			default:
				System.out.println("invalid option");
				break;
		}
		}
	}

}
