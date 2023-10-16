package SetGet_method;

public class Testshap {
public static void main(String[] args) {
	Shap s=new Shap();
	s.setBorderWidth(500);
	s.setColor("white");
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
}
}
