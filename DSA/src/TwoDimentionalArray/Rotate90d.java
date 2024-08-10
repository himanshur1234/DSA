package TwoDimentionalArray;

public class Rotate90d {
public static void print(int[][]arr,int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("=============");
}
	public static void main(String[] args) {
		int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		print(arr,n);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		print(arr,n);
		
		for(int i=0;i<n;i++) {
			int a=0,b=n-1;
			while(a<b) {
				int temp=arr[i][a];
				arr[i][a]=arr[i][b];
				arr[i][b]=temp;
				a++;
				b--;
			}
		}
		print(arr,n);
	}

}
