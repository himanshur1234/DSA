package TwoDimentionalArray;

import java.util.Scanner;

public class StoreData {

	public static void main(String[] args) {
		int[][] arr=new int[4][2];
		int m=arr.length;		
		int n=arr[0].length;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<m;i++) {
			System.out.println("Enter marks and roll number");
			for(int j=0;j<2;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
//=========column wise (transpose)=====
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				System.out.print(arr[j][i]+" ");
				
			}
			System.out.println();
		}
//=========row wise============
for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
