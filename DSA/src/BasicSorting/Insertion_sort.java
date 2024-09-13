package BasicSorting;

public class Insertion_sort {

	public static void main(String[] args) {
		int[]a= {3,5,1,4,2};
		int n=a.length;
		
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}else {
					break;
				}
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
			}

	}

}
