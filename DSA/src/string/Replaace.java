package string;

public class Replaace {

	public static void main(String[] args) {
		String s="himanshui";
		int i=0;
		while(i<s.length()) {
			if(i%2==0) {
			s=s.replace((Character.toString(s.charAt(i))), "a");
		}
			i++;
		}
		System.out.println(s);
	}

}
