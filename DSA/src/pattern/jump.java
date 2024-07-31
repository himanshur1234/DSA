package pattern;

import java.util.Scanner;

public class jump {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
//		===========================================
//		for(int i=1;i<=n;i++) {
//			int a=1;
//			for(int j=1;j<=i;j++) {
//				System.out.print(a);
//				a=a+2;
//			}
//			System.out.println();
//		}
//		============================================
		int a=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
