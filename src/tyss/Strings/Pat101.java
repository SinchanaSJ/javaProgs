package tyss.Strings;

import java.util.Iterator;

public class Pat101 {
	public static void main(String[] args) {
		int n=4;
		int sp=n-1;
		int star=1;
		for(int i=0;i<n;i++) {
		
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				if(j%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				
			}
			System.out.println();
			sp--;
			star=star+2;
		}
	}
}
