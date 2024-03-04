package Arrays;

import java.util.Scanner;

public class MergeArray2 {
	public static void main(String[] args) {
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
			int k=0;
			for (int i = 0; i < res.length; i++) {
				
				if(i<a.length)
					res[k++]=a[i];
				if(i<b.length)
					res[k++]=b[i];
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
/*int j=0;
 *  while(j<a.length && j<b.length)
 * {
 * 		res[i]=a[j];
 * 		i++;
 * 		res[i]=b[j];
 * 		i++;
 * 		j++; 
 * }
 * 
 * while(j<b.length){
 * 	res[i]=b[i];
 * 	i++;
 *	j++:
 *}
 *
 *while(j<a.length){
 * 	res[i]=b[j];
 * 	i++;
 *	j++:
 *}
 * 
 * 
 *  */
