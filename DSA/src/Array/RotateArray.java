package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void rotate(int[] arr, int k) {
        int j=arr.length-k;
        int[] b=new int[arr.length];
        int i=0;
        while(i<k){
            b[i]=arr[j];
            i++;
            j++;
        }
        j=0;
        while(i<arr.length){
            b[i]=arr[j];
            i++;
            j++;
        }
        for(int p=0;p<arr.length;p++) {
        	arr[p]=b[p];
        }
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		rotate(a, 3);
	}

}
