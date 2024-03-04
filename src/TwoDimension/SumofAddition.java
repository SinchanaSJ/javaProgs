package TwoDimension;

import java.util.Scanner;

public class SumofAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value");
		int m=sc.nextInt();
		System.out.println("enter the column value");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int [][]a=new int[m][n];
		int sum=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum=sum+a[i][j];
			}
			
		}
		System.out.println(sum);
		
	}

}
