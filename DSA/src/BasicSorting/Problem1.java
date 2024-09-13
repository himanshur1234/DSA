package BasicSorting;

public class Problem1 {

	public static void main(String[] args) {
		int[]arr= {54,11,28,47,91,63};
		int x=0;
		for(int i=0;i<arr.length;i++) {
			int min=Integer.MAX_VALUE;
			int mindx=-1;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]<min&&arr[j]>0) {
					min=arr[j];
					mindx=j;
				}
			}
			arr[mindx]=x;
			x--;
		}
		for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]*-1;
		}
		
		for(int a:arr) System.out.print(a+" ");
		
	}

}
