package tyss.Strings;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="Tester";
		String st=s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
			
		}
		for (Character character : set) {
			System.out.print(character+" ");
		}
	}

}
