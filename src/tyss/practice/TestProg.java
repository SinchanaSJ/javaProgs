package tyss.practice;

public class TestProg {

	public static void main(String[] args) {
		String s="11001011000111110011";
		char[]ch=s.toCharArray();
		int c=0;
		int num=0;
		boolean []b=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(b[i]==false) {
			int count=0;
			for (int j = i; j < b.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					b[j]=true;
				}
				else {
					break;
				}
			}
			System.out.println((ch[i]-48)+"-->"+count);if(c<count) {c=count;}
			if(count==c) {
				num=ch[i]-48;
			}
		}	
	}
		System.out.println(c);
		for (int i = 0; i < c; i++) {
			System.out.print(num);
		}
	}
}
