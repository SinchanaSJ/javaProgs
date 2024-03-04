package tyss.practice1;

import java.util.HashSet;

public class LargestSubstringWithoutDuplicates{

	public static void main(String[] args) {
		String s="aabcca";
		String len="";
		for (int i = 0; i < s.length(); i++) {
			for(int j=s.length();j>=(i+1);j--) {
				String str=s.substring(i,j);
				HashSet<Character> set=new HashSet<>();
				for (int k = 0; k < str.length(); k++) {
					set.add(str.charAt(k));
				}
				if(str.length()==set.size()) {
					//System.out.println(str);
					if(len.length()<str.length()) {
						len=str;
					}
				}
			}
		}
		System.out.println(len);
	}
}