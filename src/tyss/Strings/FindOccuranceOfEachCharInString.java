package tyss.Strings;

import java.util.HashSet;

public class FindOccuranceOfEachCharInString {

	public static void main(String[] args) {
		String s="Tester";
		String st=s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
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
			System.out.println(ch+"==>"+count);
		}

	}

}
