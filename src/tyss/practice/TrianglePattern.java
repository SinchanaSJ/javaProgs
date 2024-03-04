package tyss.practice;

public class TrianglePattern {

	public static void main(String[] args) {
		int n=4;
		int star=1;
		int sp=n-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp--;
			star+=2;
		}
	}

}
