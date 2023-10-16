package in.com.Exception;

public class TestLoginException {
public static void main(String[] args) {
	String name="admin";
	if(name.equals("admi")) {
		System.out.println("yes valid");
	}
//	else {
//		System.out.println(name.charAt(80));// is se exception aayega
//	}
	else {
		
	LoginException e=new LoginException();
	try {
		throw e;
	}
		
	catch (LoginException e2) {
		System.out.println(e2);
	}
	
}
}
}