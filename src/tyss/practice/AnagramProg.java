package tyss.practice;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramProg {

	public static void main(String[] args) {
		String s="abcd";
		String st="dab";
		ArrayList<Character> list= new ArrayList<>();
		ArrayList<Character> list1= new ArrayList<>();
		try {
		for(int i=0; i<s.length();i++) {
			list.add(s.charAt(i));
			list1.add(st.charAt(i));
		}
		}
		catch(Exception e) {
			System.out.println("Strings length are not equal");
		}
		Collections.sort(list);
		Collections.sort(list1);
		
		if(list.equals(list1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not A Anagram");
		}
		
	}

}
