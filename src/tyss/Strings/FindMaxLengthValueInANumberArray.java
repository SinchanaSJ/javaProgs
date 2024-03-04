package tyss.Strings;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindMaxLengthValueInANumberArray {
	public static void main(String[] args) {
		/*String[] s= {"1234","1","3567","526","1236"};
		String maxLen=s[0];		
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>maxLen.length()) {
				maxLen=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==maxLen.length()) {
				System.out.print(s[i]+" ");
			}
		}*/
		int[] s= {1234,1,3567,526,1236,345678};
		int maxLen=1;
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < s.length; i++) {
			int num=s[i];
			int count=0;
			while(num>0) {
				num=num/10;
				count++;
			}
			if (count>maxLen) {
				maxLen=count;
			}
			map.put(s[i], count);
		}
		for(Entry<Integer, Integer> val:map.entrySet()) {
			if(val.getValue()==maxLen) {
				System.out.println(val.getKey());
			}
		}
	}
}
