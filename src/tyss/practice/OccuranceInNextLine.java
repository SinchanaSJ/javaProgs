package tyss.practice;

public class OccuranceInNextLine {

	public static void main(String[] args) {
		String s="aabbbccfffddd";
		char[] ch = s.toCharArray();
		boolean[] b= new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(b[i]==false) {
				for (int j = i; j < b.length; j++) {
					if(ch[i]==ch[j]) {
						b[j]=true;
						System.out.print(ch[i]);
					}
					else {
						System.out.println();
						break;
					}
				}
			}
		}
	}
}