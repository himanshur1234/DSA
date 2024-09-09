package string;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder br= new StringBuilder(sc.next());
		int a= br.length();
		int i=0;
		int j=a-1;
		while(i<=j) {
			char temp=br.charAt(i);
			br.setCharAt(i, br.charAt(j));
			br.setCharAt(j, temp);
			i++;
			j--;
		}
		System.out.println(br);

	}

}
