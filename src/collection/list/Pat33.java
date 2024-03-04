package collection.list;

public class Pat33 {
	public static void main(String[] args) {
		int n=4; int k=1; char l='A';
		for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j<=n-1) {
				if(i%2==1)
					System.out.print(k+" ");
					else
						System.out.print(l+" ");
			}
			
			else
				System.out.print("  ");
					
		}
		if(i%2==1)
		k++;
		else l++;
		System.out.println();
		
	}

}
}
