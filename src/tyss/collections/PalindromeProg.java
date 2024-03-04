package tyss.collections;

public class PalindromeProg {

	public static void main(String[] args) {
		String str="gadag,sinch,lol,dad,psh";
		String[] s = str.split(",");
		for(int i=0;i<s.length;i++) {
			String res=s[i];
			char[] ch = res.toCharArray();
			String re="";

			for(int j=ch.length-1;j>=0;j--) {

				re+=ch[j];
			}
			if(re.equalsIgnoreCase(res))
				
				System.out.print("hi"+" ");
			else
				System.out.print("Bye"+" ");
		}
		
	}

}
