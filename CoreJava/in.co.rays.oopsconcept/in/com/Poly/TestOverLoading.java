package in.com.Poly;

public class TestOverLoading{
public static void main(String[] args) {
	Student s=new Student();
	s.read();
	s.read("Core java");
	s.read("sunilsir", 500);
	s.read(5000, 20);
}
}
