package TwoDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int[][]arr=new int[4][2];
		Scanner sc= new Scanner(System.in);
		
		int m=arr.length;
		System.out.println(m);//no.of rows
		int n=arr[0].length;//no. of column
		System.out.println(n);
//		==========input=======
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		=========output=======
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
//		2nd method output
		for(int[] el:arr) {
			for(int x:el) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
