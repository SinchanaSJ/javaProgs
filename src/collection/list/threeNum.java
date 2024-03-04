package collection.list;

import java.util.Scanner;

public class threeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=3;
		System.out.println("Enter the three numbers");
		int [] a=new int[size];
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		int mid=size/2;
		System.out.println(a[mid]);

	}

}
