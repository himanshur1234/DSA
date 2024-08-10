package TwoDimentionalArray;

public class MaxElement {

	public static void main(String[] args) {
		int[][]arr= {{10,22,3},{1,4,15}};
		int temp=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp=Math.max(temp, arr[i][j]);
				sum=sum+arr[i][j];
			}
		}
		System.out.println("max::"+temp);
		System.out.println("sum::"+sum);
	}

}
