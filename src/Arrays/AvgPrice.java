package Arrays;

import java.util.Scanner;

public class AvgPrice {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		double[]a=new double[size];
		System.out.println("Enter the price");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextDouble();
		}
		System.out.println("Entered Prices are: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("==============================================");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		double avg=sum/(a.length);
		System.out.println("Average Price: "+avg);
	}

}
