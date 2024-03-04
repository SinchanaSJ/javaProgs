package tyss.Strings;

public class FindMinLengthValuesInNumberArray {
	public static void main(String[] args) {
		String[] s= {"1234","1","3567","526","1236"};
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
