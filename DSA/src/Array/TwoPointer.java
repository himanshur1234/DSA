package Array;

public class TwoPointer {

	public static void main(String[] args) {
		int a[]= {1,4,6,8,2,0};
//		int temp;
//		int mid=a.length/2;
//		for(int i=0;i<a.length&&i <mid;i++) {
//			temp=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=temp;
//}
//		for(int i:a) {
//			System.out.print(i+" ");
//		}

int i=0;
int j=a.length-1;
while(i<j) {
	int temp;
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;
	j--;
}
for(int x:a) {
	System.out.print(x+" ");
}

	}

}
