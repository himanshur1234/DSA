package Array;

import java.util.Arrays;

import pattern.rectangle;

public class NextGreatestElement {
//	======method1=============
//	public static void result(int []arr) {
//		int n=arr.length;
//		int[]b=new int[n];
//		for(int i=0;i<n;i++) {
//			int temp=0;
//			for(int j=i+1;j<n;j++) {
//				temp=Math.max(temp, arr[j]);
//			}
//			if(i==n-1) {
//				b[i]=-1;
//			}else {
//			b[i]=temp;}
//		}
//		System.out.println(Arrays.toString(b));
//				}
	
	// ===========method2============optimised==========
	public static void result(int[]arr) {
		int n=arr.length;
		int nge=arr[n-1];
		int []b=new int[n];
		b[n-1]=-1;
		for(int i=n-2;i>=0;i--) {
			b[i]=nge;
			nge=Math.max(nge,arr[i]);
		}
		System.out.println(Arrays.toString(b));
		
	}
	public static void main(String[] args) {
		int a[]= {12,8,60,37,2,49,16,28,21};
		result(a);
	}

}
