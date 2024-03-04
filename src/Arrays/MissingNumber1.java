package Arrays;

import java.util.Scanner;

public class MissingNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size =sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter the integer array");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		int dif=0;
		for (int i = 0; i < a.length; i++) {
			dif=a[i+1]-a[i];
		}
		for (int i = 1; i <= 10; ) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(i==a[j]) {
					count++;
					break;
				}
				// i+dif;
			}
			if(count==0) {
				System.out.print(i+" ");
			}
			
		}

	}

}
