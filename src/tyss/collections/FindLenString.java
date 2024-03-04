package tyss.collections;
public class FindLenString {
	public static void main(String[] args) {
		String s="ghgg";
		int i=0;
		while(true) {
			try {
				s.charAt(i);
				i++;
			}
			catch(Exception e) {
				System.out.println(i);
				break;
			}
		}
	}
}