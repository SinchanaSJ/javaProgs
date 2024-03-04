package tyss.practice1;

public class FetchNextCharacterOfTheGivenString {

	public static void main(String[] args) {
		String s="simply";
		char[] ch = s.toCharArray();
		String st="";
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char) (ch[i]+2);
			st=st+ch[i];
		}
		System.out.println(st);
	}

}
