package collection.list;

public class Pat32 {
	public static void main(String[] args) {
		int n=4; int k=1; char l='A';
		for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j<=n-1) {
				if(i%2==0)
				System.out.print(k+++" ");
				else
					System.out.print(l+++" ");
			}
			else
				System.out.print("  ");
					
		}
		System.out.println();
	}

}
}
