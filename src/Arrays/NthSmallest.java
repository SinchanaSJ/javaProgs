package Arrays;

import java.util.Scanner;

public class NthSmallest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] a= {27,45,65,88,100,112,34,65};
				System.out.println("Enter the nth Smallest number for 1 to "+a.length);
				int n=sc.nextInt();
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
						System.out.println(a[i]);
						break;
					}
				}
	}
	}

