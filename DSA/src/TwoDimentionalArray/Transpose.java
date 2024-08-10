package TwoDimentionalArray;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
//		============before============
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		============after============
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
			}	
		}
//		===============================
		System.out.println("============");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}
