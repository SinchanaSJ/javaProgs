package tyss.collections;

public class ReverseAllCharactersExceptSpecialCharacters {

	public static void main(String[] args) {
		String s = "o9#Sol^ut#io$n&s"; //sn#oit^ul#os$9&o 
		String rev="";
		
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')) {
			rev=s.charAt(i)+rev;
			}
		}
		System.out.println(rev);
		int b=0;
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9'))
    		{
    			temp = temp+rev.charAt(b++);
    		}
			else {
				temp=temp+s.charAt(i);
			} 
		}
		System.out.println(temp);
	}
}