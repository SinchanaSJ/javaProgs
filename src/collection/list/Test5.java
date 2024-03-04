package collection.list;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Lower limit");
		//int low=sc.nextInt();
		System.out.println("Enter the Upper limit");
		int up=sc.nextInt();
		int sum=0;
		
		for(int j=2;j<=up;j++)
		{
			int n=j;
			int i=2;
			int count=0;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					count++;
					break;
					
				}
				i++;
			}
			if(count==0) {
			  
				sum=sum+n;
			}
		}
			  System.out.println(sum);

}
}
