package tyss.practice;

public class GetReversedDigitAndAddUsing1ForLoop {

	public static void main(String[] args) {
		String s="hello123";
		char[] ch = s.toCharArray();
		String s1="";
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			if(ch[i]>='0' &&ch[i]<='9') {
				s1=s1+ch[i];
				s2=ch[i]+s2;
			}
		}
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		System.out.println(n1+n2);
	}

}
