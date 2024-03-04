package collection.list;

public class Pat6 {
public static void main(String[] args) {
		
		int  k=2;
		int n=4;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(k+++" ");
				k++;
			}
			System.out.println();
		}
	}
}
