package tyss.practice;

import java.util.ArrayList;

public class ReverseDigitsInAStringAndAdd {

	public static void main(String[] args) {
		String st="Hello123";
		char[] ch=st.toCharArray();
		String s="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				s=ch[i]+s;
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add((int) s.charAt(i)-48);
		}
		int sum=0;
		for (int i = 0,j=0; i < ch.length && j<list.size(); i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				sum=(ch[i]-48)+list.get(j++);
				System.out.print(sum+" ");
			}
		}
	}
}