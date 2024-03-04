package tyss.practice;

import java.util.TreeMap;

public class AnagramUsingMap {

	public static void main(String[] args) {
		String s="words";
		String st="sword";
	    TreeMap <Character,Integer> map=new TreeMap<>();
	    if(s.length()==st.length())	{
	    	for(int i=0;i<s.length();i++) {
	    		map.putIfAbsent(s.charAt(i), 1);
	    		map.putIfAbsent(st.charAt(i), 1);
	    	}
	    	if(map.size()==s.length()) {
	    		System.out.println("Anagram");
	    	}
	    	else {
	    		System.out.println("Not a Anagram");
	    	}
	    }
	    else
	    	System.out.println("Not a Anagram");
	}

}
