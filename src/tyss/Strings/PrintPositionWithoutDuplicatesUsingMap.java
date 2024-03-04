package tyss.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintPositionWithoutDuplicatesUsingMap {
	public static void main(String[] args) {
		String st="TestYantra";
		String s=st.toLowerCase();
		LinkedHashMap<Character,Object> map= new LinkedHashMap<Character,Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for(Entry<Character,Object> m: map.entrySet()) {
			for (int i = 0; i < s.length(); i++) {
				if(m.getKey()==s.charAt(i)) {
					System.out.println(m.getKey()+"-->"+(i+1));
					break;
				}
		}
	}
}
}
