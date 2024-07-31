package Compositepattern;

import java.util.Scanner;

public class starTraingleVerticallyFlip {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				
				
				
//				===========================
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print((char)(j+96));
					}
					System.out.println();
				}

				
//				===========================
//				Rombous
//				for(int i=1;i<=n;i++) {
//					for(int j=1;j<=n-i;j++) {
//						System.out.print(" ");
//					}
//					for(int j=1;j<=n;j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//				===========================
//				Piramid
//				for(int i=1;i<=n;i++) {
//					for(int j=1;j<=n-i;j++) {
//						System.out.print(" ");
//					}
//					for(int j=1;j<=2*i-1;j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//				
//			===========================
//			number Piramid
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int j=1;j<=i;j++) {
//					System.out.print(j);
//					
//				}
//				for(int j=i-1;j>=1;j--) {
//					System.out.print(j);
//				}
//				System.out.println();
//			}
				
//				===========================
//				star Bridge
//				for(int j=1;j<=2*n-1;j++) {
//				System.out.print("*"+" ");
//			      }
//				System.out.println();
//				for(int i=1;i<=n;i++) {
//					
//					for(int j=1;j<=n-i;j++) {
//						System.out.print("*"+" ");
//						
//					}
//					for(int j=1;j<=2*i-1;j++) {
//					System.out.print(" "+" ");
//					}
//					for(int j=1;j<=n-i;j++) {
//						System.out.print("*"+" ");
//						
//					}
//					System.out.println();
//				}
//				
//				
				
				
			}}

		
