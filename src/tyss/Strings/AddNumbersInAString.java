package tyss.Strings;

public class AddNumbersInAString {

	public static void main(String[] args) {
		String s="a2B&c3/4";
		int sum=0;
		char[] ch = s.toCharArray();
		int[] a=new int[s.length()];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0' && ch[i]<='9') {
				//a[i]=a[i]+(ch[i]-48);
				 sum=sum+ch[i]-48;
			}
		}
		/*for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			sum=sum+a[i];
		}*/
		System.out.println(sum);
	}

}
