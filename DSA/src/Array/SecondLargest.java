package Array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {1,2,56,21,88,90,7};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);

	}

}
