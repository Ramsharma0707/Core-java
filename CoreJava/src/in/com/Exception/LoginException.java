package in.com.Exception;

public class LoginException extends RuntimeException{
	public LoginException() {
		super("invalid syntax");
	}

}
