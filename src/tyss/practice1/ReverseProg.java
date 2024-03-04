package tyss.practice1;

public class ReverseProg {

	public static void main(String[] args) {
		String s="This is Tekion";//noinT si sihT;
		String [] str=s.split(" ");
		String temp="";
		for (int i = 0; i < str.length; i++) {
			String st=str[i];
			String rev="";
			for (int j = 0; j < st.length(); j++) {
				rev=st.charAt(j)+rev;
			}
			temp=rev+" "+temp;
		}
		System.out.println(temp);
	}

}
