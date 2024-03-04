package tyss.practice;

import java.util.Scanner;

public class ConvertAnIntegerToArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int n=num;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		int [] a=new int[count];
			for(int i=0;i<count;i++) {
			int rem=num%10;
			a[i]=rem;
			num=num/10;
			}
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
