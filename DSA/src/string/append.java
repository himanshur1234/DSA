package string;

import java.util.Arrays;

public class append {

	public static void main(String[] args) {
		String s="him";
	
		StringBuilder br= new StringBuilder(s);
		br.append("raj");
		System.out.println(br);
		int[]a= {1,2,3};
		br.append(Arrays.toString(a));
		System.out.println(br);

	}

}
