package tyss.practice;

public class AddingNumbersOfAStringAndReversedString {

	public static void main(String[] args) {
		String s="abcd123";
		String s1="";
		String s2="";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				s1=s1+ch[i];
				s2=ch[i]+s2;
			}
		}
		int sum=Integer.parseInt(s1);
		int sum1=Integer.parseInt(s2);
		System.out.println(sum+sum1);
	}
}