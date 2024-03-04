package tyss.Strings;

import java.util.HashSet;

public class CountVowelsWithoutDuplicates {

	public static void main(String[] args) {
		String s="India";
		String st=s.toLowerCase();
		int count=0;
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
			
		}
		for (Character ch : set) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
					System.out.print(ch+" ");
		}
	}
		System.out.println();
		System.out.println("Total number of vowels: "+count);
	}
}
