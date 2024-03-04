package TwoDimension;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value");
		int m=sc.nextInt();
		System.out.println("enter the column value");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int [][]a=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("enter the row value");
		int m1=sc.nextInt();
		System.out.println("enter the column value");
		int n1=sc.nextInt();
		System.out.println("Enter the array elements");
		int [][]b=new int[m][n];
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				b[i][j]=sc.nextInt();
			}
			
		}
		int [] [] c= new int [m][n];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <2 ; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		if(m==m1 && n==n1) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
			
		}
		}
		else {
			System.out.println("Enter same rows and columns of 2 matrix");
		}
		
	}
}
