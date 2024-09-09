package BasicSorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {1,5,2,9,7,4,0};
		
		//bubble sort-1
//		for(int j=0;j<a.length-1;j++) {
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]>a[i+1]) {
//				int temp=a[i];
//				a[i]=a[i+1];
//				a[i+1]=temp;
//			}
//		}}
//		
//		//printing array
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
//		
		//bubble sort-2(optimised)
		
//		for(int j=0;j<a.length-1;j++) {//no. of passes
//			for(int i=0;i<a.length-1-j;i++) {//times swaping in each pass
//				if(a[i]>a[i+1]) {
//					int temp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=temp;
//				}
//			}}
//		//printing array
//				for(int i:a) {
//					System.out.print(i+" ");
//				}
				
		//more optimized
				for(int j=0;j<a.length-1;j++) {//no. of passes
					boolean flag=true;
					for(int i=0;i<a.length-1-j;i++) {//times swaping in each pass
						if(a[i]>a[i+1]) {
							int temp=a[i];
							a[i]=a[i+1];
							a[i+1]=temp;
							flag=false;
						}
					}
					if(flag==true) break;
					}
				//printing array
						for(int i:a) {
							System.out.print(i+" ");
						}

	}


}
