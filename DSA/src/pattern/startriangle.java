package pattern;

import java.util.Scanner;

public class startriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
//		star
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		number
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		// alpha 
		
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(j+64)+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
	}

}
