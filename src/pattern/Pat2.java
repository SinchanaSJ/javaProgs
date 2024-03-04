package pattern;

public class Pat2 {
	public static void main(String[] args) {
		int n=5;
		int k=n;
		for(int i=0;i<n;i++) {
			int num=0;
		for(int j=0;j<n;j++) {
			if(i<=j) {
				System.out.print(k--+" ");
				num++;
			}
			else
				System.out.print("  ");
					
		}
		k=num-1;
		System.out.println();
	}

}
}
