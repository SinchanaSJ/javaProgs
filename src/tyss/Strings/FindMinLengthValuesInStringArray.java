package tyss.Strings;

import java.util.Iterator;

public class FindMinLengthValuesInStringArray {

	public static void main(String[] args) {
		String[] s= {"abcd","a","bcdf","edf","d"};
		String minLen=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()<minLen.length()) {
				minLen=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==minLen.length()) {
				System.out.print(s[i]+" ");
			}
		}
	}
}