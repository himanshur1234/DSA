package Array;

import java.util.Arrays;

public class MegerSortedArray {
	
	public static int []  merge(int[]a ,int[]b) {
		int n=a.length;
		int m=b.length;
		int [] c=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n&&j<m) {
		if(a[i]<=b[j]) {
			c[k]=a[i];
			i++;
			k++;
		}
		else {
			c[k]=b[j];
			j++;
			k++;
		}
		}
		while(i<n) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<m) {
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}
public static void main(String[] args) {
	int a[] ={0,1,3,5,6,8};
	int b[]= {2,4,7,9};
	
	System.out.println(Arrays.toString(merge(a,b)));
	
}
}
