package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="WOW";
		char[] ch=s.toCharArray();
		String s1="";
		for (int i = ch.length-1; i>=0; i--) {
			s1=s1+ch[i];
			
		}
		 boolean p = s.equals(s1);
		 if(p) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}

}
