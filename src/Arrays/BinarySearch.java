package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size =sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter the integer array");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Enter the element to be searched");
		int key =sc.nextInt();
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key>a[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		if(count==1)
			System.out.println(key+" Key element is found");
		else
			System.out.println("Key element is not found");

	}
}