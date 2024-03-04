package tyss.practice;

import java.util.ArrayList;

public class CompleteReverseWithoutSpace {

	public static void main(String[] args) {
		String s="I am String";
		String s1=s.replace(" ", "");
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				list.add(i);
			}
		}
		for (Integer i : list) {
			sb.insert(i, " ");
		}
		System.out.println(sb);
	}

}
