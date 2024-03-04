package tyss.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicatesScenario {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of digits to pass");
		int n=sc.nextInt();
		System.out.println("Enter the digits");
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			 a[i]=sc.nextInt();
			
		}
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for(int s:set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]==s) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(s);
			}
			
		}
		
		
	}

}
