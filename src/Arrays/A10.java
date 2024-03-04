package Arrays;

import java.util.Scanner;

public class A10 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//System.out.println("Enter the size");
		//int size=sc.nextInt();
		String [] a=new String [5];
		System.out.println("Enter 5 Names");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextLine();
		}
		System.out.println("Entered elements");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		sc.close();
	}
}
