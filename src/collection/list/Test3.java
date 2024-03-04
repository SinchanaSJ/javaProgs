package collection.list;

import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	boolean n=isPerfect(num);
	System.out.println(n);
	
	
	
}
public static boolean isPerfect(int n)
{
	int sum=0;
	int  i=1;
while(i<=n/2)
{
	if(n%i==0)
	{
	sum=sum+i;
	}
	i++;
}
if(sum==n)
	return true;
else
	return false;
}

}
