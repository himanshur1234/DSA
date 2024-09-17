package SlidingWindow;

public class Max_subArrayofSizeK {

	public static void main(String[] args) {
		int[]a= {2,5,1,8,2,9,1};
		int k=3;
		int i=0;
		int j=0;
		int n=a.length;
		int sum=0;
		int max=0;
		while(j<n) {
			sum +=a[j];
			if((j-i+1)<k) {
				j++;
			}
			else if(j-i+1==k) {
				max=Math.max(max, sum);
				sum-=a[i];
				i++;
				j++;
			}
		}
		System.out.println(max);

	}

}
