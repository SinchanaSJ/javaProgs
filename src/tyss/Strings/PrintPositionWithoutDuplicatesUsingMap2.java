package tyss.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintPositionWithoutDuplicatesUsingMap2 {
	public static void main(String[] args) {
		String st="I am from I am from TestYantra";
		String s=st.toLowerCase();
		String[] str = s.split(" ");
		LinkedHashMap<String,Object> map= new LinkedHashMap<String,Object>();
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], i);
		}
		for(Entry<String,Object> m: map.entrySet()) {
			for (int i = 0; i < str.length; i++) {
				if(m.getKey().equals(str[i])) {
					System.out.println(m.getKey()+"-->"+(i+1));
					break;
				}
		}
	}
}
}
