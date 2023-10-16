package in.com.rays.MapnQueue;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Show_car_main {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter showrom name");
	String sname=sc.next();
	System.out.println("enter location");
	String saddress=sc.next();
	
	System.out.println("enter car name");
	String cname=sc.next();
	System.out.println("enter the price");
	int cprice=sc.nextInt();
	System.out.println("car type");
	String ctype=sc.next();
	Showroom ss= new Showroom();
	ss.setSname(sname);
	ss.setSaddress(saddress);
	
	Showroom s1=new Showroom();
	s1.setSname(sname);
	s1.setSaddress(saddress);
	
	Showroom s2=new Showroom();
	s1.setSname(sname);
	s1.setSaddress(saddress);
	
	Car c =new Car();
	c.setCname(cname);
	c.setCprice(cprice);
	c.setCtype(ctype);
	
	
	Car c1 =new Car();
	c.setCname(cname);
	c.setCprice(cprice);
	c.setCtype(ctype);
	
	
	HashMap<Showroom, Car> hm=new HashMap<>();
	hm.put(ss, c);
	hm.put (s1,c1);
	hm.put(s2, c1);
	
	Set<Entry<Showroom,Car>>Set=hm.entrySet();
	for(Entry<Showroom,Car>map:Set) {
		Showroom sho=map.getKey();
		Car ca=map.getValue();
		
		if(ca.cname.equals(cname)) {
			System.out.println(ca.cname+" "+ca.cprice+"  "+ca.ctype+" "+sho.sname+" "+sho.saddress);
		}
		
		
	}
	
	
	
	
	
	}
	 

}
