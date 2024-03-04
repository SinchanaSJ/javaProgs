package tyss.practice1;

public class FirstRepeatingConsecutiveCharacter {

	public static void main(String[] args) {
		String s="GeeksForGeeks";
		char[] ch = s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(b[i]==false) {
				int count=0;
				for (int j = i; j < b.length; j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
					else {
						break;
					}
				}
				if(count>1) {
					System.out.println(ch[i]);
					break;
				}
			}
		}
	}
}