package strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s="I am A Programmer";
		/* using in built method
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}*/
		char [] ch=s.toCharArray();
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ') {
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
	}

}
