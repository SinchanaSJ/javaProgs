package tyss.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PalindromePatternInString {

	public static void main(String[] args) {
		String s="ayamadamlkmalayalamkl";
		int j=0;
		String max="";
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < s.length(); i=j+1) {
			String rev="";
			String temp="";
			for ( j = i; j < s.length(); j++) {
				temp=temp+s.charAt(j);
				//System.out.println(temp);
				rev=s.charAt(j)+rev;
				if(temp.equals(rev) && j>i) {
					list.add(temp);
					if(temp.length()>max.length()) {
						max=temp;
					}
					break;
				}
			}
			
		}
		Collections.sort(list);
		System.out.println(max);
	}

}
