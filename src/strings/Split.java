package strings;

public class Split {

	public static void main(String[] args) {
		String s="hello";
		String[] str=s.split("lo");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]); 
		}
		
	}

}
