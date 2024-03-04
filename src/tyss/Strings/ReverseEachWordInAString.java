
package tyss.Strings;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String s="I am from Banglore";
		String temp="";
		//char[] ch=s.toCharArray();
		String s1[]=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String str=s1[i];
			String rev="";
			for (int j = str.length()-1; j >= 0; j--) {
				rev=rev+str.charAt(j);
				
			}
			temp=temp+rev+" ";
		}
		System.out.println(temp);
			
	
	}
}
