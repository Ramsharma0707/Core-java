package in.com.Practice_opps;

class AA{
	 void ShowA() {
		System.out.println("Parent class a");
	}
}
class BB extends AA{
	 void ShowB(){
		System.out.println("class b inherit A");
		
	}
}

class CC extends AA{
	 void ShowC() {
		System.out.println("class c inherit A");
	}
}


public class Hierarchical {
	public static void main(String[] args) {
		AA o1=new AA();
		o1.ShowA();
		System.out.println("_____________");
		BB o2=new BB();
		o2.ShowA();
		o2.ShowB();
		
		CC o3=new CC();
		o3.ShowA();
		o3.ShowC();
	}

}
