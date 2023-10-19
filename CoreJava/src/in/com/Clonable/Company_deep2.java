package in.com.Clonable;

	public class Company_deep2 implements Cloneable {
		String name;
		String Location;
		Employ_deep a1=new Employ_deep();
		public Company_deep2(String name, String Location, int id) {
			super();
			this.name = name;
			this.Location = Location;
			this.a1.id = id;
		}
			
//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			Company_deep2 w= (Company_deep2) super.clone();
//			w.a1=(Employ_deep) a1.clone();
//			return w;
		@Override
		protected Object clone() throws CloneNotSupportedException {
			Company_deep2 obj=(Company_deep2) super.clone();
			obj.a1=(Employ_deep) a1.clone();
			return obj ;
		}
		}

