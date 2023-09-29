package in.com.basic;

public class Money_pra1 {
	public static void main(String[] args) {
		int money=1844;
		int count=0;
		int note []= {500,200,100,50,20,10};
		for (int i = 0; i < note.length; i++) {
			count=money/note[i];
			if(count>0) {
				money=money%note[i];
				System.out.println(note[i] + "= " +count);
			}
		}
	}

}
