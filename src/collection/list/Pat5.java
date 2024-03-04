package collection.list;

public class Pat5 {
	public static void main(String[] args) {
		
		char  k='A';
		int n=4;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}
