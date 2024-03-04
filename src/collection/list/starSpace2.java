package collection.list;

public class starSpace2 {

	public static void main(String[] args) {
int n=4;
int star=n;
int space=n-3;
for(int i=0;i<n;i++) {
	for(int j=0;j<star;j++) {
		System.out.print("* ");
	}
	for(int j=0;j<space;j++) {
		System.out.print("  ");
	}
	System.out.println();
	star--;
	space++;
}
	}

}
