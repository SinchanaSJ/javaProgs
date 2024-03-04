package tyss.practice;

public class ConvertCases {

	public static void main(String[] args) {
		String s="HellO";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]+=32;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]-=32;
			}
			
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
//		int[]a= {12,54,465};
//		System.out.println(a);
//		nm(a);
//	}
//	public static void nm(int[] a) {
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
}

}
