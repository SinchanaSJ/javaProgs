package tyss.collections;

public class ReversePattern {

	public static void main(String[] args) {
		String s="I am Sinchana";
		String[] str = s.split(" ");
		for (int i = str.length-1; i >=0 ; i--) {
			String st = str[i];
			
			if(i==str.length-1) {
				String rev="";
				for (int j =st.length()-1; j >=0; j--) {
					rev=rev+st.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else {
				System.out.print(str[i]+" ");
			}
			
		}
		
		
	}

}
