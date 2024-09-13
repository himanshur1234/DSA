package BasicSorting;

public class Selection_kthMAx {
public static void main(String[] args) {
	int []a= {10,-4,20,1,-6,8};
	
	for(int i=a.length-1;i>=0;i--) {
		int max=Integer.MIN_VALUE;
		int maxdx=-1;
		for(int j=i;j>=0;j--) {
			if(a[j]>max) {
				max=a[j];
				maxdx=j;
			}
		}
		int temp=a[i];
		a[i]=a[maxdx];
		a[maxdx]=temp;
	}
	
	for(int i:a) {
		System.out.print(i+" ");
		}
}
}
