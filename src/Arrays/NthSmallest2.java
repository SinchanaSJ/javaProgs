package Arrays;

import java.util.Scanner;

public class NthSmallest2 {
	public static void main(String[] args) {
		
		int[] a= {27,45,65,88,100,112,34,66};
		for(int n=1; n<=a.length;n++) {
				for(int i=0;i<a.length;i++ )
				{
					int count=0;
					for (int j = 0; j < a.length; j++) {

						if(a[j]<a[i])
						{
							count++;

						}
					}
					if(count==n-1) {
						System.out.println(n+"smallest element is "+a[i]);
						break;
					}
				}
		}
	}
}
