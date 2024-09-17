package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumber {

	public static void main(String[] args) {
		int arr[]= {12, -1, -7, 8, -15, 30, 16, 28};
		int k=3;
		int i=0;
		int j=0;
		List<Integer> al=new ArrayList<>();
		while(j<arr.length) {
			if(arr[j]<0) {
				al.add(arr[j]);
			}
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				System.out.println(al.getFirst());
				if(arr[i]<0) al.removeFirst();
				if(al.isEmpty())System.out.println(0);
				i++;
				j++;
			}
		}

	}

}
