package in.com.itratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class Check {
	ArrayList<Company1>a1=new ArrayList<>();
	void checkCity(ArrayList<Company1>a1) {//kyu
		Iterator<Company1> it=a1.iterator();
		while(it.hasNext()) {
		Company1 c=it.next();
		if(c.clocation.equalsIgnoreCase("noida")) {
			System.out.println(c.Cname+"  "+c.e.eid+" "+c.e.name+" "+c.e.salary+" "+c.e.department);
		}
	}
}
	void checkCompany(ArrayList<Company1>a1) {
		Iterator<Company1> it=a1.iterator();
		while(it.hasNext()) {
		Company1 cm2=it.next();
		if(cm2.Cname.equalsIgnoreCase("hcl")) {
			System.out.println(cm2.e.eid+" "+cm2.e.name+" "+cm2.e.department+" "+cm2.e.salary+" "  +cm2.clocation);
		}
		}
	}
	void checkName (ArrayList<Company1>a1) {
		Iterator<Company1>it=a1.iterator();
		while(it.hasNext()) {
			Company1 cm3=it.next();
			if(cm3.e.name.equalsIgnoreCase("sham")) {
				System.out.println(cm3.Cname+"  "+cm3.clocation+"  "+cm3.e.eid+"  "+cm3.e.department+"  "+cm3.e.salary);
			}
		}
	}
	
	


}
