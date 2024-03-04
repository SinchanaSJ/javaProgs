package collection.list;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lower limit");
		int low=sc.nextInt();
		System.out.println("Enter the Upper limit");
		int up=sc.nextInt();
		int f1=0;
		int f2=1;
		
		for(int i=low+1;i<=up;i++)
		{
			System.out.print(f1+" , ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		//System.out.println("Sum is "+sum);

	}

}
