package Arrays;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {
		int[] a= {12,13,10,9,78,98};
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
