package tyss.Strings;

public class Pattern16 {

	public static void main(String[] args) {
		int n=5;
		char ch='a';
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i>=j) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			ch++;
			System.out.println();
		}

	}

}
