package in.com.Clonable;

public class EmployCompany_deep {
public static void main(String[] args) throws CloneNotSupportedException {
	Company_deep2 d=new Company_deep2("Hcl", "indore", 10);
	Company_deep2 d2=(Company_deep2) d.clone();
	d2.name="tcs";
	d2.Location="sanwer";
	d2.a1.id=11;
	System.out.println(d.name);
	System.out.println(d.Location);
	System.out.println(d.a1.id);
	System.out.println(d2.name);
	System.out.println(d2.Location);
	System.out.println(d2.a1.id);
}
}
