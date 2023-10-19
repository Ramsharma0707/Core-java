package in.com.itratormethod;

public class Company1 {
String Cname;
String clocation;
Employe e;//object
public Company1(String cname, String clocation, Employe e) {//constructor
	super();
	Cname = cname;
	this.clocation = clocation;
	this.e = e;
}
@Override
public String toString() {
	return "Company1 [Cname=" + Cname + ", clocation=" + clocation + "]";
}

}
