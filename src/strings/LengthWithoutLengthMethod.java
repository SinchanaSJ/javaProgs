package strings;

public class LengthWithoutLengthMethod {

	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		int length=0;
		for(char ch1:ch) {
			length++;
		}
		System.out.println(length);
	}

}
