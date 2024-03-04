package tyss.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountVowelsWithoutDuplicatesUsingMap {
	public static void main(String[] args) {
		String st="TestYantra";
		int count=0;
		String s=st.toLowerCase();
		LinkedHashMap<Character,Object> map= new LinkedHashMap<Character,Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for(Entry<Character,Object> m: map.entrySet()) {
			if(m.getKey()=='a'||m.getKey()=='e'||m.getKey()=='i'||m.getKey()=='o'||m.getKey()=='u') {
				count++;
				System.out.print(m.getKey()+"--> "+count);
				System.out.println();
		}
	}
}
}
