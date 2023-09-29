package SetGet_method;

public class Account {
	String CName;
	int Account_no;
	float Balance;
	
	
	public Account(String cName2, int account_no2, int balance2) {
		// TODO Auto-generated constructor stub
	}
	public void setCName(String CName) {
		this.CName = CName;
	}
	public String getCName() {
		return CName;
	}
	public void  setAccount_no(int Account_no) {
		this.Account_no=Account_no;
		
	}
	
	public int getAccount_no() {
		return Account_no;
	}
	public void setBalance(float Balance) {
		this.Balance=Balance;
	}
	public float getBalance() {
		return Balance;
	}
}
