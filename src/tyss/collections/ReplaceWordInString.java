package tyss.collections;

public class ReplaceWordInString {

	public static void main(String[] args) {
		String s="I selenium you";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("selenium")) {
				System.out.print("hate"+" ");}
			else
				System.out.print(str[i]+" ");
		}
	}

}
