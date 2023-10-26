package in.com.r_practice;

public class CountConVowel {
	public static void main(String[] args) {
		String s="Thsi text for count vcowel and Consonent ";
		String s1=s.replace(" ", "");
		char ch[]=s1.toCharArray();
		int Ccount=0; int vcount=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o' || ch[i]=='u') {
				
			
			vcount++;
		}
		else if (ch[i]>'a'|| ch[i]<'z') {
			Ccount++;

		}
	}
		System.out.println(vcount);
		System.out.println(Ccount);

}
}