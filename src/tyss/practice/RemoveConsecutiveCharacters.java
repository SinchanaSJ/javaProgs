package tyss.practice;

public class RemoveConsecutiveCharacters {

	public static void main(String[] args) {
		String s="cbaabcm";
		System.out.println(removeConsecutives(s));
		}
	public static String removeConsecutives(String s) {
		if (s=="" || s.length()==1) {
			return s;
		}
		else {
		String str=s;
		char ch[] = s.toCharArray();
		String s1=s;
		boolean[] b=new boolean[ch.length];
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			if(b[i]==false) {
				for ( int j = i; j < str.length(); j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
					else
						break;
				}
				if(count>1) {
					str=s.replace(ch[i], ' ');
					str=str.replace(" ", "");
					//System.out.println(str);
				}
			}
		}
		if(s1.equals(str))
			return s1;
		else {
		s1=str;
		return removeConsecutives(s1);
		}
		}	
	}
}

