package Array;

import java.util.Arrays;

public class SortZeroOnes {
	//===========================================
	//=======sort colour=====================
//	method 1
	
//	public static int[] sort(int[]nums,int n) {
//		int noz=0;
//		int noO=0;
//		int not=0;
//		for(int x:nums) {
//			if(x==1) {
//				noO++;
//			}
//			else if(x==0) {
//				noz++;
//			}
//			else {
//				not++;
//			}
//		}
//		for(int i=0;i<n;i++) {
//			if(i<noz) {
//				nums[i]=0;
//			}
//			else if(i<noO+noz) {
//				nums[i]=1;
//			}
//			else {
//				nums[i]=2;
//			}
//		}
//		return nums;
//	}
//	=============method2============duct flag algo===========
	
	public static void swap(int[]ar,int mid,int high) {
		int temp=ar[mid];
		ar[mid]=ar[high];
		ar[high]=temp;
	}
	private static int[] sort(int[] arr, int n) {
		int low=0;
		int mid=0;
		int high=n-1;
		while(high>=mid) {
			if(arr[mid]==0) {swap(arr,mid,low);
			low++;
			mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr,mid,high);
				high--;
			}
		}
		return arr;
	}

	
	
	
	
	
//	==========noraml 0 and 1=============
	
//	public static int[]sort(int []nums,int n){
//		int i=0;
//		int j=n-1;
//		while(i<j) {
//			if(nums[i]==0) i++;
//			else if(nums[j]==1) j--;
//			else if(nums[i]>nums[j]) {
//				nums[i]=0;
//				nums[j]=1;
//				i++;
//				j--;
//			}
//			
//		}
//		
//		return nums;
//		
//	}
	
	public static void main(String[] args) {
		int a[]= {2,0,1};
		int n=a.length;
		a=sort(a,n);
		System.out.println(Arrays.toString(a));

	}

	
}
