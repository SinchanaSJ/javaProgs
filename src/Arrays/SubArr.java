package Arrays;

import java.util.Scanner;

public class SubArr {
	public static int [] subArr(int [] a,  int index) {
		if(index<0 || index>a.length) {
			System.out.println("Index not in range");
		}
		int [] res= new int[a.length-1];
		//res[index]=ele;
		for (int i = 0; i < res.length; i++) {
			if(i<index) {
				res[i]=a[i];
			}
			else {
				res[i]=a[i+1];
			}
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
		/*System.out.println("Enter the element");
		int ele=sc.nextInt();*/
		System.out.println("Enter the index");
		int index=sc.nextInt();
		int [] res=subArr(a,index);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
		
	}
}
