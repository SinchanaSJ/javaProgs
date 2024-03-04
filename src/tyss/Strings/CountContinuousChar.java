package tyss.Strings;

public class CountContinuousChar {

	public static void main(String[] args) {
		String str="aaabbaacdddf";//a3b2a2cd3f
		char[] ch=str.toCharArray();
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
				if(count>1)
					System.out.print(ch[i]+""+count);
				else
					System.out.print(ch[i]);
			}
		}
	}

}
