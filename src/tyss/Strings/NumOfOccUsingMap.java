package tyss.Strings;

import java.util.HashMap;

public class NumOfOccUsingMap {

	public static void main(String[] args) {
		String s="sjdcdcnc";
		HashMap<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		else {
			map.put(s.charAt(i), 1);
		}
			
		}
			System.out.println(map);
	}

}
