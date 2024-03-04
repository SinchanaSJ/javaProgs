package tyss.Strings;

public class FindMaxLengthValueInAStringArray {
	public static void main(String[] args) {
		String[] s= {"abcd","a","bcdf","edf","d"};
		String maxLen=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>maxLen.length()) {
				maxLen=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==maxLen.length()) {
				System.out.print(s[i]+" ");
			}
		}
	}
}
