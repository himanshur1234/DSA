package Array;

import java.util.Scanner;

public class LinearSeaarch {
	static boolean found(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return true;
			}
			if(a[i]==a[a.length-1]) {
				return false;
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= {1,4,65,24,76,90};
		if(found(a,n)) {
		System.out.println("number found ");
		}else {
			System.out.println("number not found");
		}
		
		
	}

}
