package tyss.practice;

public class MaxPalindromeInTheString {

	public static void main(String[] args) {
		String s="ayamalayalammadam";
		int len=0;
		String max="";
		for (int i = 0; i <s.length(); i++) {
			for (int j = i+1; j <=s.length(); j++) {
				String s1=s.substring(i, j);
				String rev="";
				rev=reverse(s1);
				if(s1.equals(rev)) {
					if(s1.length()>len) {
						len=s1.length();
						max=s1;
					}
				}
			}
		}
		System.out.println(max+"-->"+len);
	}
	public static String reverse(String str) {
		String r="";
		for (int i = 0; i < str.length(); i++) {
			r=str.charAt(i)+r;
		}
		return r;
	}
}
