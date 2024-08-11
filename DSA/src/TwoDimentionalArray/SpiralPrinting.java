package TwoDimentionalArray;

public class SpiralPrinting {
	public static void print(int[][]arr,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=============");
	}
	public static void main(String[] args) {
		int [][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
		int m=arr.length;
		int n=arr[0].length;
		print(arr,m,n);
		int min_r=0;
		int min_c=0;
		int max_r=m-1;
		int max_c=n-1;
		while(min_r<=max_r || min_c<max_c) {
//			blue
			for(int j=min_c;j<=max_c;j++) {
				System.out.print(arr[min_r][j]+" ");
			}
			min_r++;
			if(min_r>max_r||min_c>max_c)break;
//			orange
			for(int i=min_r;i<=max_r;i++) {
				System.out.print(arr[i][max_c]+" ");
			}
			max_c--;
			if(min_r>max_r||min_c>max_c)break;
//			red
			for(int j=max_c;j>=min_c;j--) {
				System.out.print(arr[max_r][j]+" ");
			}
			max_r--;
			if(min_r>max_r||min_c>max_c)break;
//			green
			for(int i=max_r;i>=min_r;i--) {
				System.out.print(arr[i][min_c]+" ");
			}
			min_c++;
			
		}
		
		
		
		
		
		
	}

}
