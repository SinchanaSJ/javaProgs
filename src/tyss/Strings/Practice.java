package tyss.Strings;

import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {
		String s="I am I am from Asia";
		String[] str = s.split(" ");
		String temp="";
		for (int i = 0; i < str.length; i++) {
			String st=str[i];
			String rev="";
			for (int j = st.length()-1; j >=0 ; j--) {
				rev=rev+st.charAt(j);
			}
			temp=temp+rev+" ";
		}
		
		System.out.println(temp);
		}
	}


