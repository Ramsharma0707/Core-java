package Interface;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void HepltoOters() {
		System.out.println("social worker interface ");

	}

	@Override
	public void AnimalResue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void earnMoney(int s, int b) {
		System.out.println("this is for richman inertface");

		int multi = s * b;
		System.out.println(s);
		System.out.println(multi);
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void part() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
	//	System.out.println(Richman.s = 100);//final h ise change ni kr skte
		Richman r = new Businessman();

		r.earnMoney(8, 5);

		r.earnMoney("Himan", 8000);
		SocialWorker s = new Businessman();
		s.HepltoOters();
		Businessman b = new Businessman();
		b.AnimalResue();
		b.donation();
		b.earnMoney(100, 200);
		b.HepltoOters();
	}

	@Override
	public void earnMoney(String a, int c) {
		System.out.println(a + " " + c);

	}

}
