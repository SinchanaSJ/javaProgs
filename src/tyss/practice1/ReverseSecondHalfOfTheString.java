package tyss.practice1;

public class ReverseSecondHalfOfTheString {

	public static void main(String[] args) {
		String s="sinchana";//sincanah
		String rev="";
		String rev1="";
		for (int i = 0; i < s.length(); i++) {
			if(i<s.length()/2) {
				rev=rev+s.charAt(i);
			}
			else {
				rev1=s.charAt(i)+rev1;
			}
		}
		System.out.println(rev+rev1);
	}
}