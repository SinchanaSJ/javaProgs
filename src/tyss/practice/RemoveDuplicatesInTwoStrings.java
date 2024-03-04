package tyss.practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicatesInTwoStrings {

	public static void main(String[] args) {
		String s1="This is fun show";
		String s2="fun tv show";
		
		String[] str=s1.concat(" "+s2).toLowerCase().split("\\s+");
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < str.length; i++) {
			if(map.containsKey(str[i]))
				map.put(str[i], map.get(str[i])+1);
			else
				map.put(str[i], 1);
		}
		for(Entry<String,Integer> h:map.entrySet()) {
			if(h.getValue()==1) {
				System.out.print(h.getKey()+" ");
			}
		}
	}

}