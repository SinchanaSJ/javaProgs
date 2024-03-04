package tyss.practice;

public class InvertedTrianglePattern {

	public static void main(String[] args) {
		int n=4;
		int star=n*2-1;
		int sp=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			star-=2;
		}
	}

}
