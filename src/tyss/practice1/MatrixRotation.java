package tyss.practice1;

public class MatrixRotation {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=a.length-1;i>=0;i--)
		{
			int b[] = a[i];
			for(int j=b.length-1;j>=0;j--)
			{
				System.out.print(b[j]+" ");
			}
			System.out.println();
		}
	}

}
