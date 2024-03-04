package collection.list;

public class AlphaPat1 {
public static void main(String[] args) {
	int n=5;
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || i==n/2|| j==0||(j==n-1 && i<=n/2))
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}*/
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || j==n/2||(i==n-1 && j<=n/2)||(i==n-2 && j==0))
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || i==n/2|| j==0||j==n-1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((j==0 &&i<=n/2) || (j==n-1 && i<=n/2)|| (i==3 && j==1)|| i==4 && j==2||i==3 && j==3)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || i==n/2|| j==0||j==n-1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((j==0 && i<=n/2)|| i==n/2||( j==n-1 && i<=n/2)||(j==n/2 && i>=n/2))
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
