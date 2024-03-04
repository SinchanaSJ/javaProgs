package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {

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
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key) {
				count++;
				break;
			}
		}
		if(count!=0) {
			System.out.println("Key is present");
		}
		else
			System.out.println("Key not present");

	}

}
