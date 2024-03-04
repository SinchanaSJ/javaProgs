package TwoDimension;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value");
		int m=sc.nextInt();
		System.out.println("enter the column value");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int [][]c=new int[m][n];
		int [][]res=new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j]=sc.nextInt();
			}
			
		}                                                                                                
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j]=c[j][i];
				
			}
		}
		System.out.println("Transposed array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
