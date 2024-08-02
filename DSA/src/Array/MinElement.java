package Array;

public class MinElement {

	public static void main(String[] args) {
	int a[]= {2,-3,-55,-6,-71,-1,9,0};
	int min=a[0];
	for(int s:a) {
		if(s<min)min=s;
	}
	System.out.println(min);
	}

}
