package string;

public class reverseEachWord {
	public static void revrse(StringBuilder br,int i,int j) {
		while(i<=j) {
			char temp=br.charAt(i);
			br.setCharAt(i, br.charAt(j));
			br.setCharAt(j, temp);
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		StringBuilder br=new StringBuilder("i am himanshu rawat");
		int i=0,j=0;
		while(j<br.length()) {
			if(br.charAt(j)!=' ') j++;
			else {
				revrse(br, i, j-1);
				j++;
				i=j;
			}
		}
		revrse(br, i, j-1);//for last world
		System.out.println(br);

	}

}
