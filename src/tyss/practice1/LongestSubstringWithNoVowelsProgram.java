package tyss.practice1;

public class LongestSubstringWithNoVowelsProgram {

	public static void main(String[] args) {
		String s="prakashk";
		String len="";
		for(int i=0;i<s.length();i++) {
			for(int j=s.length(); j>=(i+1); j--) {
				String str=s.substring(i,j);
				
				if(!str.contains(""+'a') && !str.contains(""+'e') && !str.contains(""+'i') && !str.contains(""+'o') && !str.contains(""+'u')) {
				if(len.length()<str.length()) {
						len=str;
					}
				}
			}
		}
		System.out.println(len);
	}

}
