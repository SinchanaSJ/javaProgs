package collection.list;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem--;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Strong no");
		else
			System.out.println("Not a Strong no");
		

	}

}
