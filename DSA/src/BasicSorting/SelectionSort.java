package BasicSorting;

public class SelectionSort {
	public static void  print(int[]arr) {
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int []a= {10,-4,20,1,-6,8};
		System.out.println("before");
		print(a);
		for(int i=0;i<a.length-1;i++) {
			int min=Integer.MAX_VALUE;
			int mindx=-1;
			for(int j=i;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					mindx=j;
				}
			}
			//swap
			int temp=a[i];
			a[i]=a[mindx];
			a[mindx]=temp;
		}
		System.out.println("after");
		print(a);

	}

}
