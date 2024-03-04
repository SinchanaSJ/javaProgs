package collection.list;

public class Pat13 {
	public static void main(String[] args) {	
		int n=4;
		int l=3;
		int m=1;char  k='A';
			for(int j=0;j<l;j++)
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
