package Compositepattern;

import java.util.Scanner;

public class numberBridge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=2*n-1;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			int a=1;
			for( int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
				a++;
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" "+" ");
				a++;
			}
			for( int j=1;j<=n-i;j++) {
				System.out.print(a+++" ");
			}
			
			System.out.println();
//			System.out.println(j);
		}

	}

}
