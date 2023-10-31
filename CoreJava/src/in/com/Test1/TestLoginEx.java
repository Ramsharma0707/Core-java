package in.com.Test1;

public class TestLoginEx {
	public static void main(String[] args) {
		String name="Ram";
		if(name.equals("Ram")) {
			System.out.println("text match");
		}
		else {
			LoginEx e= new LoginEx();
			try {
				throw e;
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
