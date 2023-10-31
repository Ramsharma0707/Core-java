package in.com.Logic;

public class CharReplce {
public static void main(String[] args) {
	String name="rahul ";
	char ch[]=name.toCharArray();
	for (int i = 0; i < ch.length; i++) {
	if(ch[i]=='r'|| ch[i]=='a') {
		
	ch[i]='@';
	}
	}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
}
	
	
}
