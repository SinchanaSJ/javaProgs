package tyss.practice;

public class FetchParticularWordInAString {

	public static void main(String[] args) {
		String s="hihelloworldhihelloworldfellowhellowhello";
		String st="world";
		for (int i = 0; i <= s.length()-st.length(); i++) {
			if(st.equals(s.substring(i, i+st.length()))) {
				System.out.println(s.substring(i,i+st.length()));
			}
		}
	}
}