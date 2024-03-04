package tyss.Strings;

public class Swap1stAndLastWordInAString {

	public static void main(String[] args) {
		String s="I am from Shivamogga";
		String s1[]=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
	}

}
