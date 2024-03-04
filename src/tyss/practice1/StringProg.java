package tyss.practice1;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringProg {

	public static void main(String[] args) {
		String s="india isxyz india";  //zyxs
		String[] str = s.split(" ");
		String rev="";
		String st="";
		HashMap<String,Integer> map=new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if(map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i])+1);
			}
			else {
				map.put(str[i], 1);
			}
		}
		for(Entry<String,Integer> e:map.entrySet()) {
			if(e.getValue()==1) {
				for (int i = 1; i < e.getKey().length(); i++) {
					rev=e.getKey().charAt(i)+rev;
				}
				System.out.println(rev);
			}
		}
	}
}