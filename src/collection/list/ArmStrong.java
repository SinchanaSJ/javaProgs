package collection.list;

import java.util.Scanner;

public class ArmStrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt(); 
		 int num=m;
		 int sum=0;
		 int count=0;
		 int temp=num;
		 int temp1=num;

		 while(num>0)
		{
			num=num/10;
			count++;
		}
		while(temp>0)
		{
			int rem=temp%10;
			int res=1;
			int i=1;
			while(i<=count)
			{
				res=res*rem;
				i++;
			}
			sum=sum+res;
			temp=temp/10;
		}
		if(sum==temp1)
		 System.out.println(temp1+" Armstrong no.");
		else
		  System.out.println(temp1+" Not a Armstrong no.");
	}
}
