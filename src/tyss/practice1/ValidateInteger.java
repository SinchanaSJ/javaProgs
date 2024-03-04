package tyss.practice1;

public class ValidateInteger {

	public static void main(String[] args) {
		String s="86.45";
		String[] str = s.split("[.]");
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
//		String ss=str[1];
//		for(int i=0;i<ss.length();i++)
//			if(Character.isDigit(ss.charAt(i)))
//			{
//				System.out.println("its integer");
//			}
		String s1=str[1];
		Integer.parseInt(s1);
		System.out.println(s1);
	}
}