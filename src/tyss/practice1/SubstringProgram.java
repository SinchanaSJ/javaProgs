package tyss.practice1;

public class SubstringProgram {

	    public static void largestSubstring3() {
	       String s = "ABADEFGMABEF";
//	    	String s="gghjm,kjls";
	       String temp = "";
	       String largestString="";
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i ; j < s.length(); j++) {
	                temp = returnLargest(s.substring(i, j + 1), s);
	                temp=temp.trim();
	                if (temp.length()>largestString.length()) {
	                    largestString=temp;
	                }
	            }
	        }
	       
	        System.out.println(largestString);
	    }
	    public static String returnLargest(String st, String s){
	        char[] ch1=st.toCharArray();
	        char ch[]=new char[st.length()];
	        for (int i = 0; i < ch1.length; i++) {
	            boolean found=false;
	            for (int j = 0; j < ch.length; j++) {
	                if (ch1[i]!=ch[j]) {
	                   found=false;
	                }
	                else{
	                    found=true;
	                    break;
	                 }
	            }
	            if (!found) {
	                ch[i]=ch1[i];
	            }
	            else
	            break;
	        }
	        String s1=new String(ch);
	        return s1;
	    }
	    public static void main(String[] args) {
	    	largestSubstring3();
		}
}