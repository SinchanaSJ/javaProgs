package collection.list;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lower limit");
		int low=sc.nextInt();
		System.out.println("Enter the Upper limit");
		int up=sc.nextInt();
		int sum=0;
		for(int i=low+1;i<=up;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum is "+sum);

	}

}
