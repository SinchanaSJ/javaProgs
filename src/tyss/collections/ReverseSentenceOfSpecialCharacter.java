package tyss.collections;

public class ReverseSentenceOfSpecialCharacter {

	public static void main(String[] args) {
		String s="!hi !i wh!y kick!";//!ih !i yh!w kcik! 
	//	String s="o9#sol^ut#io$n&s";//sn#oit^ul#os$9&o 
		String[] st=s.split(" ");
		String temp="";
		
		for (int i = 0; i < st.length; i++) {
			String sr=st[i];
			String rev="";
				for(int j=sr.length()-1;j>=0;j--) {
					if(sr.charAt(j)>='a'&& sr.charAt(j)<='z' )
					rev=rev+sr.charAt(j);
				}
				String m="";
				int b=0;
				for (int j = 0; j < sr.length(); j++) {
					if(sr.charAt(j)>='a'&& sr.charAt(j)<='z') {
						m=m+rev.charAt(b++);
					}
					else {
						m=m+sr.charAt(j);
					}
				}
				temp=temp+m+" ";
				
		}
		System.out.println(temp);		
	}

}
