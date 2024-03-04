package collection.list;

import java.util.Scanner;

public class PalindromeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	isPal(n);
}
	public static void isPal(int num)
	{	
	
	int n=num;
	int rev=0; 
	int temp=n;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;		
	}
	if(temp==rev)	
	{
		System.out.println("Palindrome");
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println(count);
			
	}
	else
	{
		if(temp%2==0)
		{
			System.out.println("Not a palindrome no and divisible by 2");
		}
		else
		{
			System.out.println("Not a palindrome no and not divisible by 2");
		}
	}
	}
}
	
