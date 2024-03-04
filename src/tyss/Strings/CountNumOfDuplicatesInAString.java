package tyss.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountNumOfDuplicatesInAString {

	public static void main(String[] args) {
		String s="Tester";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
			
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < st.length(); i++) {
				if(st.charAt(i)==ch) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(ch+"==>"+count);
			}
	}
		
	}
}
