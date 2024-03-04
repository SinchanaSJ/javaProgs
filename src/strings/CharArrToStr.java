package strings;

public class CharArrToStr {

	public static void main(String[] args) {
		/*char [] ch= {'q','s','l','m'};
		String s=new String(ch);
		System.out.println(s);*/
		char [] ch= {'q','s','l','m'};
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			s1=s1+ch[i];
		}
		System.out.println(s1);
		
	}

}
