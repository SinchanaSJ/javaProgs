package Arrays;

import java.util.Scanner;

public class EvenOddArray {

	public static int[] count(int [] a) {
		int [] res=new int [2];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
				res[0]++;
			else
				res[1]++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int [] a= new int [size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
			}	
		int [] res=count(a);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
			
		}
	}

}
