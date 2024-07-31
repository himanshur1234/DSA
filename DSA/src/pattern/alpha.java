package pattern;

import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
//			int c='A';
			for(int j=1;j<=n;j++) {
				
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
		
	}

}
