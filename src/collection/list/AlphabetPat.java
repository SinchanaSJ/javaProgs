package collection.list;

public class AlphabetPat {

	public static void main(String[] args) {
		int n=5;
		//A
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
		//B
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2|| j==0||j==n-1||i==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//C
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0||i==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//D
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1|| j==0||j==n-1||j==1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//E
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1|| j==0||i==n/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//F
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0||i==n/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//G
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1|| j==0||(j==n-1 && i>=n/2)|| (i==2 && j==3))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//H
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n/2 || j==n-1|| j==0)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//I
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1||j==n/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//J
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
		//K
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==1||(i+j==n-1)||i==j)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//L
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//M
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1||(i==j && i<=n/2)||(i+j==n-1 && i<=n/2))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//N
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1||i==j )
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//O
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1|| j==0||j==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//P
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || (i<=n/2 && j==n-1)|| j==0||i==n/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//Q
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1|| j==0||j==n-1||(i>=n/2 && i==j) )
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//R
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||j==0|| j==1|| (i<=n/2 && j==n-1)||i==n/2||(i>=n/2 && i==j))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//S
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if( i==0  || i==n/2 || i==n-1 || (i<n/2 && j==0) || (i>n/2 && j==n-1) )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//T
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if( i==0  || j==n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		} 
		System.out.println();
		//U
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if( j==0  || j==n-1 || i==n-1  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//V
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
		//W
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1|| (i>=n/2 && i+j==n-1)|| (i>=n/2 && i==j))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//X
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//Y
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i<=n/2)|| i==n/2||( j==n-1 && i<=n/2)||(j==n/2 && i>=n/2))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//Z
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||i+j==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
