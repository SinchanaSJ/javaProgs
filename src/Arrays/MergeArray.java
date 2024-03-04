package Arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		/*int [] a= {10,20,30,40,50};
		int [] b= {60,70,80,90};
		int [] res= new int [a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			res[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i]=b[i];
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}*/
		int [] a=toRead();
		int [] b=toRead();
		int [] res=merge(a,b);
		System.out.println("Merged array");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
		public static int [] merge(int []a, int[] b)
		{
			int [] res= new int[a.length+b.length];
			for (int i = 0; i < a.length; i++) {
				res[i]=a[i];
				
			}
			for (int i = 0; i < b.length; i++) {
				res[a.length+i]=b[i];
			}
			return res;
		}
		public static int[] toRead() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int n=sc.nextInt();
			int [] a=new int[n];
			System.out.println("Enter the array elements");
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			return a;
			
		
		}
	}

