package tyss.practice1;

public class PatternProg {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			char k='f';
			for(int j=0;j<n;j++) {
				if(i%2==0) {
				if(i+j<=(n-1)) {
					System.out.print(" "+k++);
				}
				else {
					System.out.print("  ");
				}
				}
				
				else {
					
					if(i+j<=(n-1)) {
						System.out.print(" "+k--);
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
/*
 * a b c d e
 * a b c d
 * b c d
 * b c
 * c
 */
