package tyss.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromASentence {

	public static void main(String[] args) {
		String s="I am I am from Banglore";
		String st=s.toLowerCase();
		String [] str=st.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		for (String string : set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(string.equals(str[i])) {
					count++;
				}
			}
			System.out.println(string+"-->"+count);
		}
	}

}
