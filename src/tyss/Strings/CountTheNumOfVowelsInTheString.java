package tyss.Strings;

public class CountTheNumOfVowelsInTheString {

	public static void main(String[] args) {
		String s = "Software";
		String st= s.toLowerCase();
		int count=0;
		for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				count++;
				System.out.println(st.charAt(i));
			}
			
		}
		System.out.println("Number of vowels in the given string is: "+count);
	}

}
