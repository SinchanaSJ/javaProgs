package tyss.collections;

import java.util.Arrays;
import java.util.Scanner;

public class NameSortingProg {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Number of names to be added");
		    int size=sc.nextInt();
			String [] a=new String [size];
			System.out.println("Enter the names: ");
		    for(int i=0;i<a.length;i++){
		        a[i]=sc.next();
		    }
		    Arrays.sort(a);
		    System.out.println("Entered names are: ");
		    for(int i=0;i<a.length;i++){
		        System.out.println(a[i]);
		    }
	}
}