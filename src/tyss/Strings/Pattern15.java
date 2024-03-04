package tyss.Strings;

public class Pattern15 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			char ch='a';
			
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					System.out.print(ch+++" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
//a         
//a b       
//a b c     
//a b c d   
//a b c d e 
