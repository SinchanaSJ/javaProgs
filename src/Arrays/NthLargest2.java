package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest2 {

	public static void main(String[] args) {
		int[] a= {27,45,65,88,100,112,34,66};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Arrays.sort(a);
		
		System.out.println(a[a.length-n]);
	}

}
