package collection.list;

public class Pat10 {
	public static void main(String[] args) {	
		int n=4;
		
			for(int j=0;j<n;j++)
			{
				int m=1;char  k='A';
				for(int i=0;i<n;i++)
				{
					if(j%2==0)
					System.out.print(k+++" ");
					else
						System.out.print(m+++" ");
					
				}
				System.out.println();
			}
		}

}
