package tyss.collections;

public class CountVowelsInString {

	public static void main(String[] args) {
		String s="sinch apple orange";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count=0;
			String st=str[i];
			char[] ch = st.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {
					count++;
				}
			}
			
				System.out.println(str[i]+"-->"+count);
			
		}
		
	}
}
