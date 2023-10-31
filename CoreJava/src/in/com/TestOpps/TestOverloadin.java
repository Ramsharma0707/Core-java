package in.com.TestOpps;

public class TestOverloadin {
public static void main(String[] args) {
	PolyOverloadingCompany p=new PolyOverloadingCompany();
	p.Com();
	p.Com("Tcs");
	p.Com(90000000, "Tcs");
	System.out.println(p);
}
}
