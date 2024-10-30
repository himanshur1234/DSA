package BinarySearch;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int arr[]= {1,2,6,7,89,90};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enterr the target");
		int target=sc.nextInt();
		int n=arr.length;
		int low=0;
		int high=n-1;
		boolean flag=false;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				flag=true;
				break;
			}
			else if(arr[mid]>target) high=mid-1;
			else low=mid+1;
		}
		if(flag==true) System.out.println("found");
		else System.out.println("not found");

	}

}
