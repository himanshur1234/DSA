package BasicSorting;

public class CheckSorting {

	public static void main(String[] args) {
		int []a= {1,4,2,5,7,8};
		boolean flag=false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				System.out.println("NOt sorted");
				flag=true;
				break;
			}
		}
		if(flag==false) System.out.println("sorted");
		

	}

}
