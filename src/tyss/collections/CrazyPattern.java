package tyss.collections;

public class CrazyPattern {

	public static void main(String[] args) {
		String s="aabbccab";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			System.out.print(ch[i]+""+ch[i+1]);
		}
	}

}
//aaabbbbccccaab
