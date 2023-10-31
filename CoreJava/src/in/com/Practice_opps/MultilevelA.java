package in.com.Practice_opps;

class A {
	void ShowA() {
		System.out.println("This msg from class A");
	}}

	class B extends A{
		void ShowB() {
			System.out.println("This msg from class B that extends class A");
		}	}
	
	class C extends B{
		void ShowC() {
			System.out.println("its class c that can inherit properties of class A and b");
		}
		
	}
		public class MultilevelA{
			public static void main(String[] args) {
				A obj1=new A();
				obj1.ShowA();
				
				B obj2=new B();
				obj2.ShowA();
				obj2.ShowB();
				
				C obj3=new C();
				obj3.ShowA();
				obj3.ShowB();
				obj3.ShowC();
				
			}
	
		
		
	}
	
