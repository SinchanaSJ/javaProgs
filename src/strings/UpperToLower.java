package strings;

public class UpperToLower {
	public static void main(String[] args) {
		String st="HEkhjLLO";
		String s=st.toUpperCase();
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z')
				if(i%2==0) {
					ch[i]+=32;
				}
				else {
					ch[i]=ch[i];
				}
	}
		String s1=new String(ch);
		System.out.println(s1);

}
}
