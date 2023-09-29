package SetGet_method;

	public class Clg {
		private int id;
		private String name;
		private String year;
		
		public void setId(int id) {
			this.id=id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setYear(String year) {
			this.year=year;
		}
		public String getYear() {
			return year;
		}
		public static void main(String[] args) {
			Clg c=new Clg();
			c.setId(101);
			c.setName("Encapsulation");
			c.setYear("jan");
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getYear());
		}
}
