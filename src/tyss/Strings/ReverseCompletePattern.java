package tyss.Strings;

public class ReverseCompletePattern {

	public static void main(String[] args) {
		// i/p: I am from Banglore
		// o/p: e ro lagn aBmorfa.
		
	//	String s="I am from Banglore";
	/*	String temp="";
		
		String s1[]=s.split(" ");
		char[] ch=s.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >=0 ; i--) {
			if(ch[i]!=' ') {
				rev=rev+ch[i];
			}
		}
		String str2="";
		char[] ch1=rev.toCharArray();
		int k=0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				str2=str2+ch1[k];
				k++;
			}
			str2=str2+" ";
		}
		System.out.println(str2);  */
		String s="I am from Banglore";
		String str="";
		int k=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
			str=s.charAt(i)+str;
			}
		}
		//System.out.println(str);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				System.out.print(" ");
			}
			else {
				System.out.print(str.charAt(k++));
			}
		}
	}

}
