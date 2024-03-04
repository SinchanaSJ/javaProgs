package tyss.practice1;

public class AlphaNumericPattern {

	public static void main(String[] args) {
		String alpha="abcd";
		String num="1234";
		String s=alpha+num;
		String str="";
		for (int i = 0; i < s.length(); i++) {
			if(i<alpha.length()) {
				str=str+alpha.charAt(i);
			}
			if(i<num.length()) {
				str=str+num.charAt(i);
			}
		}
		System.out.println(str);
	}

}
