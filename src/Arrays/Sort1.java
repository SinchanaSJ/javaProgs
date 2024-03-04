package Arrays;

import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {
		int a[]= {12,45,43,10,9,21};
		int n = a.length;
		System.out.println("Before soting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Arrays.sort(a,n/2,n);
		Arrays.sort(a,0,n/2);
		System.out.println("After soting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
