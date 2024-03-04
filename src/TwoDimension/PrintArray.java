package TwoDimension;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value");
		int m=sc.nextInt();
		System.out.println("enter the column value");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int [][]c=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j]=sc.nextInt();
			}
			
		}
		//System.out.println(c.length);
		//System.out.println(c[1].length);
		System.out.println("Entered array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
