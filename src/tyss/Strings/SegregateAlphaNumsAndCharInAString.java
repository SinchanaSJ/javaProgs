package tyss.Strings;

public class SegregateAlphaNumsAndCharInAString {

	public static void main(String[] args) {
		String s="a2B&c3/";
		String alp="";
		String num="";
		String spl="";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z') {
				alp=alp+ch[i];
			
			}
			
			else if(ch[i]>='0'&&ch[i]<='9') {
				num=num+ch[i];
				
			}
			else {
				spl=spl+ch[i];
				
			}
		}
		System.out.println("Alphabets are: "+alp);
		System.out.println("Numbers are: "+num);
		System.out.println("Special characters are: "+spl);
	}
}
