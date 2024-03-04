package tyss.Strings;

import java.util.LinkedHashSet;

public class CountCharacterAndPrint {

	public static void main(String[] args) {
		/*String s="aaabbaacdddf";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.print(ch+""+count);
		}
		System.out.println();*/
		
		 String s="aaabbaacdddf";
		    LinkedHashSet<Character> set=new LinkedHashSet<>();
		    for(int i=0;i<s.length();i++){
		        set.add(s.charAt(i));
		    }
		    for(Character m:set){
		        int count=0;
		        for(int i=0;i<s.length();i++){
		            if(m==s.charAt(i)){
		                count++;
		            }
		        }
		        System.out.print(m+""+count);
		    }
		    System.out.println();
	}
}
