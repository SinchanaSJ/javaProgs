package tyss.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountNumOfDuplicatesUsingMap2 {
	public static void main(String[] args) {
		String st="I am from I am from TestYantra";
		String s=st.toLowerCase();
		String[] str = s.split(" ");
		LinkedHashMap<String,Object> map= new LinkedHashMap<String,Object>();
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], i);
		}
		for(Entry<String,Object> m: map.entrySet()) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(m.getKey().equals(str[i])) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(m.getKey()+"-->"+count);
				
			}
		}
	

}

}
