package in.com.Test1;

public class TestCompany_Employ {
	public static void main(String[] args) throws CloneNotSupportedException {
		Company_Employ cm=new Company_Employ("sagar", "ef", 101);
		Company_Employ cm2=(Company_Employ) cm.clone() ;
		cm2.name="dilip";
		cm2.address="rajasthan";
		cm2.c.id=102;
		System.out.println(cm.c.id);
		System.out.println(cm.name);
		System.out.println(cm.address);
		System.out.println(cm2.name);
		System.out.println(cm2.address);
		System.out.println(cm2.c.id);
		
	}

}
