package strings;

public class GetBytesProg {

	public static void main(String[] args) {
		String s="hello";
		byte[] str = s.getBytes();
		System.out.println(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
