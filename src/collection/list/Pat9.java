package collection.list;

public class Pat9 {
	public static void main(String[] args) {	
		int n=4;
		int m=1;char  k='A';
			for(int j=0;j<n;j++)
			{
			
				
				for(int i=0;i<n;i++)
				{
					if(i%2==0)
					System.out.print(k+++" ");
					else
						System.out.print(m+++" ");
					
				}
				System.out.println();
			}
		}
}
