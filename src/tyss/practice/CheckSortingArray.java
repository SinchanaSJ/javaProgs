package tyss.practice;

import java.util.Scanner;

public class CheckSortingArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int[]a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		int count1=0;
		if(a.length>=2) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]<=a[i+1]) {
				count++;
			}
			else if(a[i]>=a[i+1]) {
				count1++;
			}
			else {
				System.out.println("Not sorted");
				break;
			}
		}
		if(count==a.length-1) {
			System.out.println("Ascending");
		}
		else if(count1==a.length-1) {
			System.out.println("Descending");
		}
		else
			System.out.println("Not sorted ");
		
		}
		else {
			System.out.println("Enter atleast 2 element");
		}

	}

}
