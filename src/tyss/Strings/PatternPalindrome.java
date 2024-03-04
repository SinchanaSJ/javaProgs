package tyss.Strings;

public class PatternPalindrome {

	public static void main(String[] args) {
		int n=4;
		int star=1;
		int sp=n-1;
		for (int i = 0; i < n; i++) {
			int k=1;
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print(k+" ");
				if(j<star/2)
					k++;
				else
					k--;
			
				}
			System.out.println();
			sp--;
			star=star+2;
		}
	}
}