package tyss.Strings;

import java.util.LinkedHashSet;

public class PositionOfEachCharInReverse {

	public static void main(String[] args) {
		String s="Tester";// r=6, e=5 t=4, s=3
		String st=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}
		
		for (Character ch : set) {
			for (int i = st.length()-1; i >=0; i--) {
				if(ch==st.charAt(i)) {
				System.out.println(ch+"-->"+(i+1));
				break;
				}
			}
			
		}
	}

}
