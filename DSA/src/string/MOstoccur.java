package string;

public class MOstoccur {

	public static void main(String[] args) {
		String s="himanshu";
		int[]arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[(int)s.charAt(i)-97]++;
		}
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				System.out.println((char)(i+97));
			}
		}

	}

}
