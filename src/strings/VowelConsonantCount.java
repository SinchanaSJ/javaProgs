package strings;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String s="HELLO9865";
		int vow=0;
		int cons=0;
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z') {
				char ch1=ch[i];
				if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
					vow++;
				}
				else 
					cons++;
			}
		}

		System.out.println(vow);
		System.out.println(cons);

	}

}
