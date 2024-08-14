package TwoDimentionalArray;

public class Multiplication {
	public static void multi(int[][]a,int[][]b){
		int n=a.length, m=a[0].length,p=b.length,q=b[0].length;
		int[][]c=new int[n][q];
		if(m!=p) {
			System.out.println("not possible");
		}else {
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[0].length;j++) {
					for(int k=0;k<m;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}

	}
	public static void main(String[] args) {
		int[][]a= {{1,2,1},{2,1,2}};
		int[][]b= {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
		
		multi(a,b);
		

	}

}
