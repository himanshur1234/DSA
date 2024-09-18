package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Count_anagram {

	public static void main(String[] args) {
		String s="forxxorfxdofr";
		String patten="for";
		int k=patten.length();
		Map<Character,Integer> m=new HashMap<>();
		for(char c:patten.toCharArray()) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		int count =m.size();
		int ans=0;
		int i=0;
		int j=0;
		while(j<s.length()){
			if(m.containsKey(s.charAt(j))) {
		m.put(s.charAt(j), m.get(s.charAt(j))-1);
			if (m.get(s.charAt(j))== 0) {
                count--;
            }
			}
		if(j-i+1<k) {
			j++;
		}
		else if(j-i+1==k) {
			if(count==0) {
				ans++;
			}
			if(m.containsKey(s.charAt(i))) {
				if(m.get(s.charAt(i))==0) {
					count++;
				}
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			
			i++;
			j++;
		}
	}
		System.out.println(ans);

}}
