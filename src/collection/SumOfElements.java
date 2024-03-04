package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList l= new ArrayList<>();
		System.out.println("Enter 10 elements");
		for (int i = 0; i < 10; i++) {
			int a=sc.nextInt();
			l.add(a);
			
		}
		System.out.println(l);
		int sum=0;
		for (int i = 0; i < l.size(); i++) {
			Integer i1=(Integer)l.get(i);
			sum=sum+i1;
		}
		System.out.println(sum);
	}

}
