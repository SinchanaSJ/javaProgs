package tyss.Strings;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String s="Hello";
		int i=0;
		while(true) {
			try {
				s.charAt(i);
				i++;
			}
			catch (Exception e) {
				System.out.println(i);
				break;
			}
		}
	}

}
