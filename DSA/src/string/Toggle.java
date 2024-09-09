package string;

public class Toggle {

	public static void main(String[] args) {
		String s="HiManshU";
		StringBuilder b= new StringBuilder(s);
		for(int i=0;i<b.length();i++) {
			char ch=b.charAt(i);
			int assi=(int)ch;
			if((assi>=65&&assi<=90)){
				assi +=32;
				ch=(char)assi;
				b.setCharAt(i, ch);
			}
			else if((assi>=97&&assi<=122)){
				assi -=32;
				ch=(char)assi;
				b.setCharAt(i, ch);
			}
		}
		System.out.println(b);

	}

}
