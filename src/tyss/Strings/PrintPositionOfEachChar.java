package tyss.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintPositionOfEachChar {

	public static void main(String[] args) {
		String s="Tester";//t=1, e=2, s=3, r=6;
		String st=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
			
		}
		
		for (Character ch : set) {
			for (int i = 0; i < st.length(); i++) {
				if(ch==st.charAt(i)) {
				System.out.println(ch+"-->"+(i+1));
				break;
				}
			}
			
		}
		
	}

}
