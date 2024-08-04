package Array;

import java.util.ArrayList;

public class BasicOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>(6);
		arr.add(0, 1);
		arr.add(1, 2);
		arr.add(2, 4);
		arr.add(3, 6);
		arr.add(4, 17);
		arr.add(5, 19);
		System.out.println(arr);
		System.out.println(arr.size());
		arr.add(40);
		System.out.println(arr.size());
		System.out.println(arr);
	}

}
