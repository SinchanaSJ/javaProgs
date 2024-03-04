package tyss.practice;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s="words";
		String st="sword";
		char[] ch=s.toCharArray();
		char[] c=st.toCharArray();
		Arrays.sort(ch);//dorsw
		Arrays.sort(c);//dorsw
		if(String.valueOf(ch).equals(String.valueOf(c))) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
	}

}
