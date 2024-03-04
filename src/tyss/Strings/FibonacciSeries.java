package tyss.Strings;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the range of Fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3;
		
		for (int i = 0; i < n; i++) {
			System.out.print(fib1+" ");
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			
		}
	}

}
