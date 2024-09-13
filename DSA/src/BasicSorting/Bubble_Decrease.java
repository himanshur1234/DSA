package BasicSorting;

public class Bubble_Decrease {

	public static void main(String[] args) {
		int[]a= {1,7,2,0,56,23,78,8};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>0;j--) {
				if(a[j]>a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i:a) {
		System.out.print(i+" ");
		}		
		
	}

	}


