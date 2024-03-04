package tyss.Strings;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CountNumOfUpperAndLowerCaseChar {

	public static void main(String[] args) {
		String s="bAnGLoRE";
		int up=0;
		int low=0;
		char [] ch=s.toCharArray();
		/*for (int i = 0; i < ch.length; i++) {
			int n=(int)ch[i];
			//System.out.println(n);
			if(n>=65 && n<=90) {
				up++;
			}
			else if (n>=97 && n<=122) {
				low++;
			}
		}
		System.out.println(low);
		System.out.println(up);
		*/
	
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				up++;
			}
			else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				low++;
			}
		}
		System.out.println(low);
		System.out.println(up);
}
}