package in.com.basic;

public class Calcu_switch {
	public static void main(String[] args) {
		double num1=700;
		double num2=500;
		double result;
		String operator="*";
		switch(operator) {
		case "+":
			result=num1+num2;
			System.out.println("Sum of this no ="+result);
		break;
		case "-":
			result=num1-num2;
			System.out.println("Subtraction of this ="+result);
		break;
		case "*":
			result=num1*num2;
			System.out.println("Multiplication of this= "+result);
			break;
		case "/":
			result=num1/num2;
			System.out.println("division of this no =" +result);
			break;
			default:
				System.out.println("this operation is not valid");
		break;
		}
		
		
	}

}
