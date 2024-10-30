package BinarySearch;

import java.util.Scanner;

public class Lower_Bound {

	public static void main(String[] args) {
		int arr[]= {10,20,30,30,40,50,60,70};
		int low=0;
		int high=arr.length-1;
		int lb=arr.length;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enterr the target");
		int target=sc.nextInt();
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=target) {
				lb=Math.min(mid, lb);
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		System.out.println(lb);

	}

}
