package tyss.collections;

public class ContinousPattern {

	public static void main(String[] args) {
		String s="sinchana";
		char[] ch = s.toCharArray();
		System.out.print(s+" ");
		for (int i = 0; i < s.length(); i++) {
			String r="";
			for(int j=0;j<ch.length-1;j++) {
				
				r+=ch[j];
			}
			System.out.print(r+" ");

			ch=r.toCharArray();
	}
		/*String str="";
		for (int i = 0; i < s.length(); i++) {
			str=str+s.charAt(i);
			System.out.print(str+" ");
		}*/
}
}
